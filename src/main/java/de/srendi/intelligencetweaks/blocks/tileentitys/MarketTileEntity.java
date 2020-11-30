package de.srendi.intelligencetweaks.blocks.tileentitys;

import de.srendi.intelligencetweaks.setup.ModTileEntityTypes;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class MarketTileEntity extends TileEntity implements ITickableTileEntity {


    public MarketTileEntity() { this(ModTileEntityTypes.MARKET.get()); }

    public MarketTileEntity(TileEntityType<?> tileEntityTypeIn) { super(tileEntityTypeIn); }

    @Override
    public void tick() {

    }
}
