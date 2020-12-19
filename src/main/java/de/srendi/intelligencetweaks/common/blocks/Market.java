package de.srendi.intelligencetweaks.common.blocks;

import de.srendi.intelligencetweaks.common.setup.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class Market extends Block {

    public Market() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(0.5F, 2)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE)
                .sound(SoundType.WOOD));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntityTypes.MARKET.get().create();
    }
}
