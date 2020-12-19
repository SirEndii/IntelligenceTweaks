package de.srendi.intelligencetweaks.common.configuration;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.google.common.collect.Lists;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;
import java.util.List;

public class IntelligenceConfig {

    public static ForgeConfigSpec.ConfigValue<String> JOIN_MESSAGE;

    public static ForgeConfigSpec.BooleanValue SEND_JOIN_MESSAGE;

    public static ForgeConfigSpec.ConfigValue<List<? extends String>> START_ITEMS;


    public static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON_CONFIG;

    static {

        COMMON_BUILDER.comment("").push("Join Stuff");

        SEND_JOIN_MESSAGE = COMMON_BUILDER.comment("Activate whether the message should be sent or not.").define("sendJoinMessage", true);

        START_ITEMS = COMMON_BUILDER.comment("The items to be given to a player when they join a world or server for the first time.").define("first_items", Lists.newArrayList("minecraft:dirt", "ftbquests:book", "intelligencetweaks:silver_coin"),
                it -> it instanceof String);

        JOIN_MESSAGE = COMMON_BUILDER.comment("The message to be send to a player when they join a world or server.")
                .define("joinMessage", "Thank you for playing Intelligence: New Horizon. If you want, you can join the Discord https://discord.srendi.de or leave a review on Curseforge.");

        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec spec, final Path path) {

        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync().autosave().writingMode(WritingMode.REPLACE).build();

        configData.load();
        spec.setConfig(configData);

    }

}
