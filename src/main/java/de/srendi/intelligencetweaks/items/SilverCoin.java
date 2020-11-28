package de.srendi.intelligencetweaks.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SilverCoin extends Item {

    public SilverCoin() {
        super(new Properties().group(ItemGroup.MISC).isImmuneToFire());
    }
}
