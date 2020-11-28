package de.srendi.intelligencetweaks;

import de.srendi.intelligencetweaks.configuration.IntelligenceConfig;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod("intelligencetweaks")
public class IntelligenceTweaks {

    public static final String MOD_ID = "intelligencetweaks";

    public static Logger LOGGER = LogManager.getLogger();

    public IntelligenceTweaks() {

        System.setProperty("java.awt.headless", "false");

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, IntelligenceConfig.COMMON_CONFIG);
        IntelligenceConfig.loadConfig(IntelligenceConfig.COMMON_CONFIG, FMLPaths.CONFIGDIR.get()
                .resolve("intelligencetweaks-common.toml"));



    }

}
