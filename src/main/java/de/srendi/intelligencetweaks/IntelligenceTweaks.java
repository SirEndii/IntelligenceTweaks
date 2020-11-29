package de.srendi.intelligencetweaks;

import de.srendi.intelligencetweaks.configuration.IntelligenceConfig;
import de.srendi.intelligencetweaks.setup.Registration;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("intelligencetweaks")
public class IntelligenceTweaks {

    public static final String MOD_ID = "intelligencetweaks";

    public static Logger LOGGER = LogManager.getLogger();

    public IntelligenceTweaks() {
        Registration.register();

        System.setProperty("java.awt.headless", "false");

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, IntelligenceConfig.COMMON_CONFIG);
        IntelligenceConfig.loadConfig(IntelligenceConfig.COMMON_CONFIG, FMLPaths.CONFIGDIR.get()
                .resolve("intelligencetweaks-common.toml"));

    }

}
