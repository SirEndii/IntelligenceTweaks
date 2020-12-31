package de.srendi.intelligencetweaks.common.configuration;

import de.srendi.intelligencetweaks.IntelligenceTweaks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod.EventBusSubscriber(modid = IntelligenceTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConfigHandler {

    @SubscribeEvent
    public static void configEvent(final ModConfig.ModConfigEvent event) {
        if (event.getConfig().getSpec() == ConfigHolder.COMMON_SPEC) {
            ConfigHandler.bakeCommon();
        }
    }

    private static void bakeCommon() {
        IntelligenceConfig.joinMessage = ConfigHolder.COMMON_CONFIG.JOIN_MESSAGE.get();
        IntelligenceConfig.sendJoinMessage = ConfigHolder.COMMON_CONFIG.SEND_JOIN_MESSAGE.get();
        IntelligenceConfig.startItems = ConfigHolder.COMMON_CONFIG.START_ITEMS.get();
    }
}
