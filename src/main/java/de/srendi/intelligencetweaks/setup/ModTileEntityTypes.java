package de.srendi.intelligencetweaks.setup;

import com.google.common.collect.Sets;
import de.srendi.intelligencetweaks.blocks.tileentitys.MarketTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class ModTileEntityTypes {

    public static final RegistryObject<TileEntityType<MarketTileEntity>> MARKET = Registration.TILE_ENTITYS.register(
            "market", () -> new TileEntityType<>(MarketTileEntity::new, Sets.newHashSet(ModBlocks.MARKET.get()), null));

    static void register() {

    }

}
