package de.srendi.intelligencetweaks.events;

import de.srendi.intelligencetweaks.IntelligenceTweaks;
import de.srendi.intelligencetweaks.configuration.IntelligenceConfig;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.stats.ServerStatisticsManager;
import net.minecraft.stats.Stats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.UUID;

@Mod.EventBusSubscriber(modid = IntelligenceTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {

    @SubscribeEvent
    public static void onWorldJoin(PlayerEvent.PlayerLoggedInEvent event) {
        PlayerEntity player = event.getPlayer();
        if(IntelligenceConfig.SEND_JOIN_MESSAGE.get()) {
            sendMessage(player, IntelligenceConfig.JOIN_MESSAGE.get());
            if(!hasPlayedBefore(player)) {
                for (String item : IntelligenceConfig.START_ITEMS.get()) {
                    ResourceLocation resourceLocation = new ResourceLocation(item);
                    ItemStack itemStack = new ItemStack(ForgeRegistries.ITEMS.getValue(resourceLocation));
                    player.addItemStackToInventory(itemStack);
                }
            }
        }
    }

    /*private static boolean hasPlayedBefore(PlayerEntity player) {
        World world = player.getEntityWorld();
        if(!world.isRemote) {
            if (world instanceof ServerWorld) {
                ServerWorld serverWorld = (ServerWorld) world;
                int leaves = serverWorld.getServer().getPlayerList().getPlayerStats(player).getValue(Stats.CUSTOM, Stats.LEAVE_GAME);
                return leaves > 0;
            }
        }
        return false;
    }*/

    private static boolean hasPlayedBefore(PlayerEntity player) {
        CompoundNBT tag = player.getPersistentData().getCompound(PlayerEntity.PERSISTED_NBT_TAG);
        String playedBefore = "played_before";
        if(tag.getBoolean(playedBefore)) {
            return true;
        } else {
            tag.putBoolean(playedBefore, true);
            player.getPersistentData().put(PlayerEntity.PERSISTED_NBT_TAG, tag);
            return false;
        }
    }

    private static void sendMessage(PlayerEntity player, String message) {
        player.sendMessage(new StringTextComponent(message), UUID.randomUUID());
    }

}
