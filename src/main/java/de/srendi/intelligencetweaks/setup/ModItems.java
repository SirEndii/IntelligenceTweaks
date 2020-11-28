package de.srendi.intelligencetweaks.setup;

import de.srendi.intelligencetweaks.items.SilverCoin;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> SILVER_COIN = Registration.ITEMS.register("silver_coin", SilverCoin::new);

    public static void register() {

    }

}
