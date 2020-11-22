package de.srendi.intelligencetweaks.configuration;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class IntelligenceConfig {

    public static ForgeConfigSpec.ConfigValue<String> WELCOME_MESSAGE;
    public static ForgeConfigSpec.ConfigValue<String> JOIN_MESSAGE;

    public static ForgeConfigSpec.BooleanValue SEND_WELCOME_MESSAGE;
    public static ForgeConfigSpec.BooleanValue SEND_JOIN_MESSAGE;

    public static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON_CONFIG;

    static {

        COMMON_BUILDER.comment("Messages").push("Messages");

        SEND_JOIN_MESSAGE = COMMON_BUILDER.comment("Should the mod send the Join Message").define("sendJoinMessage", true);
        SEND_WELCOME_MESSAGE = COMMON_BUILDER.comment("Should the mod send the Welcome Message").define("sendWelcomeMessage", true);

        JOIN_MESSAGE = COMMON_BUILDER.comment("This is the message every player gets when they join a world or a server.")
                .define("joinMessage", "Thank you for playing Intelligence: New Horizon. <3 ");
        WELCOME_MESSAGE = COMMON_BUILDER.comment("This is the message that every player only gets once when he joins a world or a server..")
                .define("welcomeMessage", "Thank you for playing Intelligence: New Horizon. If you want, you can join the Discord https://discord.srendi.de or leave a review on Curseforge.");

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
