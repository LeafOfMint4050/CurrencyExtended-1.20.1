package com.LeafofMint.CurrencyExtended.item;

import com.LeafofMint.CurrencyExtended.CurrencyExtended;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CurrencyExtended.MOD_ID);

    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BRONZE_COIN = ITEMS.register("bronze_coin",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
