package de.srendi.intelligencetweaks.setup;

import de.srendi.intelligencetweaks.items.Coin;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> SILVER_COIN = Registration.ITEMS.register("silver_coin", Coin::new);
    public static final RegistryObject<Item> GOLD_COIN = Registration.ITEMS.register("gold_coin", Coin::new);
    public static final RegistryObject<Item> DIAMOND_COIN = Registration.ITEMS.register("diamond_coin", Coin::new);
    public static final RegistryObject<Item> NETHERITE_COIN = Registration.ITEMS.register("netherite_coin", Coin::new);

    public static void register() {

    }

}
