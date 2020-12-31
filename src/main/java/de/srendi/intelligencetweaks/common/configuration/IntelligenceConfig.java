package de.srendi.intelligencetweaks.common.configuration;

import com.google.common.collect.Lists;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class IntelligenceConfig {

    public static String joinMessage;
    public static boolean sendJoinMessage;
    public static List<? extends String> startItems;

    public static class CommonConfig {

        final ForgeConfigSpec.ConfigValue<String> JOIN_MESSAGE;
        final ForgeConfigSpec.BooleanValue SEND_JOIN_MESSAGE;
        final ForgeConfigSpec.ConfigValue<List<? extends String>> START_ITEMS;

        CommonConfig(final ForgeConfigSpec.Builder builder) {
            builder.comment("").push("Join Stuff");

            SEND_JOIN_MESSAGE = builder.comment("Activate whether the message should be sent or not.").define("sendJoinMessage", true);
            START_ITEMS = builder.comment("The items to be given to a player when they join a world or server for the first time.").define("first_items", Lists.newArrayList("minecraft:dirt", "ftbquests:book", "intelligencetweaks:silver_coin"),
                    it -> it instanceof String);
            JOIN_MESSAGE = builder.comment("The message to be send to a player when they join a world or server.")
                    .define("joinMessage", "Thank you for playing Intelligence: New Horizon. If you want, you can join the Discord https://discord.srendi.de or leave a review on Curseforge.");

            builder.pop();
        }
    }
}