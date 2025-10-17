package com.shikateroken.practice1_mod.registry;

import com.shikateroken.practice1_mod.main.Practice1;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Practice1Tabs {
    public static final DeferredRegister<CreativeModeTab>
            MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Practice1.Mod_ID);

    public static final RegistryObject<CreativeModeTab>Practice1_List = MOD_TABS.register("practice1"
            ,()-> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.practice1"))
            .icon(() -> new ItemStack(Practice1items.PRACTICE_INGOT.get()))
            .displayItems((parameters, output) ->{
        for (Supplier<Item> itemSupplier : Practice1List.items.get()){
        output.accept(itemSupplier.get());
    }
    })
                    .build());
    public static void register(IEventBus bus) {MOD_TABS.register(bus);}

}
