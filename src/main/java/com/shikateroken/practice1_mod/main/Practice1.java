package com.shikateroken.practice1_mod.main;

import com.shikateroken.practice1_mod.registry.Practice1Tabs;
import com.shikateroken.practice1_mod.registry.Practice1blocks;
import com.shikateroken.practice1_mod.registry.Practice1items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("practice1")
@SuppressWarnings("removal")
public class Practice1 {
    public static final String Mod_ID = "practice1";


    public Practice1() {
        //Process of starting mod

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Practice1items.ITEMS.register(bus);

        Practice1blocks.Blocks.BLOCKS.register(bus);
        Practice1blocks.BlockItems.BLOCK_ITEMS.register(bus);

        Practice1Tabs.MOD_TABS.register(bus);
    }
}
