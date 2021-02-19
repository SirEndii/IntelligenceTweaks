package de.srendi.intelligencetweaks;

import de.srendi.intelligencetweaks.common.configuration.ConfigHolder;
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

    public static Logger LOGGER = LogManager.getLogger(MOD_ID);

    public IntelligenceTweaks() {
        getLOGGER().info("Hello World from IntelligenceTweaks.");
        Registration.register();

        /*Increases maximumValue of every RangedAttributes
        for (final Attribute attribute : ForgeRegistries.ATTRIBUTES) {
            if (attribute instanceof RangedAttribute) {
                RangedAttribute ranged = (RangedAttribute) attribute;
                ranged.minimumValue = 0;
                ranged.maximumValue = 65536;
                getLOGGER().info("Max Value for Ranged Attribute " + ranged.getAttributeName() + " set to 65536");
            }
        }*/

        getLOGGER().info("Register configs..");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHolder.COMMON_SPEC);

    }

    public static Logger getLOGGER() {
        return LOGGER;
    }
}