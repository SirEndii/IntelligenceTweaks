package de.srendi.intelligencetweaks;

import de.srendi.intelligencetweaks.common.configuration.IntelligenceConfig;
import de.srendi.intelligencetweaks.common.setup.Registration;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(IntelligenceTweaks.MOD_ID)
public class IntelligenceTweaks {

    public static final String MOD_ID = "intelligencetweaks";

    public static Logger LOGGER = LogManager.getLogger();

    public IntelligenceTweaks() {
        getLOGGER().debug("Hello World from IntelligenceTweaks.");
        Registration.register();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, IntelligenceConfig.COMMON_CONFIG);
        IntelligenceConfig.loadConfig(IntelligenceConfig.COMMON_CONFIG, FMLPaths.CONFIGDIR.get()
                .resolve("intelligencetweaks-common.toml"));

        //Increases maximumValue of every Attributes
        for (final Attribute attribute : ForgeRegistries.ATTRIBUTES) {

            if (attribute instanceof RangedAttribute) {
                RangedAttribute ranged = (RangedAttribute) attribute;
                ranged.minimumValue = 0;
                ranged.maximumValue = 65536;
                getLOGGER().debug("Max Value for Ranged Attribute " + ranged.getAttributeName() + " set to 65536");
            }
        }
    }

    public static Logger getLOGGER() {
        return LOGGER;
    }
}