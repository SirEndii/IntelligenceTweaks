package de.srendi.intelligencetweaks.events;

import de.srendi.intelligencetweaks.IntelligenceTweaks;
import de.srendi.intelligencetweaks.configuration.IntelligenceConfig;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;

@Mod.EventBusSubscriber(modid = IntelligenceTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {

    @SubscribeEvent
    public static void onWorldJoin(PlayerEvent.PlayerLoggedInEvent event) {
        PlayerEntity player = event.getPlayer();
        if(IntelligenceConfig.SEND_JOIN_MESSAGE.get()) {
            player.sendMessage(new StringTextComponent(IntelligenceConfig.JOIN_MESSAGE.get()), UUID.randomUUID());
        }
    }

}
