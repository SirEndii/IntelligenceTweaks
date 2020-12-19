package de.srendi.intelligencetweaks.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Coin extends Item {

    public Coin() {
        super(new Properties().group(ItemGroup.MISC).isImmuneToFire());
    }
}
