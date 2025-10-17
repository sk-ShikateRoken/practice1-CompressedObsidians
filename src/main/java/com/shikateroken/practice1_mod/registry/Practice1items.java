package com.shikateroken.practice1_mod.registry;

import com.shikateroken.practice1_mod.item.item_practice_ingot;
import com.shikateroken.practice1_mod.main.Practice1;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Practice1items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Practice1.Mod_ID);

    public static final RegistryObject<Item> PRACTICE_INGOT = ITEMS.register("practice_ingot", item_practice_ingot::new);

    public static void register(IEventBus eventBus)
    {ITEMS.register(eventBus);}
}
