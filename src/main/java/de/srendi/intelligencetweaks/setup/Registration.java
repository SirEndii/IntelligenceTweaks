package de.srendi.intelligencetweaks.setup;

import de.srendi.intelligencetweaks.IntelligenceTweaks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IntelligenceTweaks.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, IntelligenceTweaks.MOD_ID);
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITYS = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, IntelligenceTweaks.MOD_ID);

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
        TILE_ENTITYS.register(modEventBus);

        ModItems.register();
        ModBlocks.register();
        ModTileEntityTypes.register();
    }

}
