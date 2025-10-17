package com.shikateroken.practice1_mod.registry;

import com.shikateroken.practice1_mod.block.block_Compressed_Obsidian;
import com.shikateroken.practice1_mod.block.block_compressed_obsidian_power_2;
import com.shikateroken.practice1_mod.block.block_compressed_obsidian_power_3;
import com.shikateroken.practice1_mod.block.block_compressed_obsidian_power_4;
import com.shikateroken.practice1_mod.block.block_compressed_obsidian_power_5;
import com.shikateroken.practice1_mod.block.block_compressed_obsidian_power_6;
import com.shikateroken.practice1_mod.block.block_compressed_obsidian_power_7;
import com.shikateroken.practice1_mod.block.block_compressed_obsidian_power_8;
import com.shikateroken.practice1_mod.block.block_compressed_obsidian_power_9;

import com.shikateroken.practice1_mod.main.Practice1;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Practice1blocks {
    public static class Blocks{
        public static final DeferredRegister<Block>BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Practice1.Mod_ID);

        public static final RegistryObject<Block>COMPRESSED_OBSIDIAN = BLOCKS.register("compressed_obsidian", block_Compressed_Obsidian::new);
        public static final RegistryObject<Block> COMPRESSED_OBSIDIAN_POWER_2 = BLOCKS.register("compressed_obsidian_power_2", block_compressed_obsidian_power_2::new);
        public static final RegistryObject<Block> COMPRESSED_OBSIDIAN_POWER_3 = BLOCKS.register("compressed_obsidian_power_3", block_compressed_obsidian_power_3::new);
        public static final RegistryObject<Block> COMPRESSED_OBSIDIAN_POWER_4 = BLOCKS.register("compressed_obsidian_power_4", block_compressed_obsidian_power_4::new);
        public static final RegistryObject<Block> COMPRESSED_OBSIDIAN_POWER_5 = BLOCKS.register("compressed_obsidian_power_5", block_compressed_obsidian_power_5::new);
        public static final RegistryObject<Block> COMPRESSED_OBSIDIAN_POWER_6 = BLOCKS.register("compressed_obsidian_power_6", block_compressed_obsidian_power_6::new);
        public static final RegistryObject<Block> COMPRESSED_OBSIDIAN_POWER_7 = BLOCKS.register("compressed_obsidian_power_7", block_compressed_obsidian_power_7::new);
        public static final RegistryObject<Block> COMPRESSED_OBSIDIAN_POWER_8 = BLOCKS.register("compressed_obsidian_power_8", block_compressed_obsidian_power_8::new);
        public static final RegistryObject<Block> COMPRESSED_OBSIDIAN_POWER_9 = BLOCKS.register("compressed_obsidian_power_9", block_compressed_obsidian_power_9::new);

        public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}
    }
    public static class BlockItems{
        public static final DeferredRegister<Item>BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Practice1.Mod_ID);

        public static final RegistryObject<Item>COMPRESSED_OBSIDIAN = BLOCK_ITEMS.register("compressed_obsidian",
                ()->new BlockItem(Blocks.COMPRESSED_OBSIDIAN.get(), new Item.Properties()));

        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN_POWER_2 = BLOCK_ITEMS.register("compressed_obsidian_power_2",
                ()->new BlockItem(Blocks.COMPRESSED_OBSIDIAN_POWER_2.get(), new Item.Properties()));

        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN_POWER_3 = BLOCK_ITEMS.register("compressed_obsidian_power_3",
                ()->new BlockItem(Blocks.COMPRESSED_OBSIDIAN_POWER_3.get(), new Item.Properties()));

        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN_POWER_4 = BLOCK_ITEMS.register("compressed_obsidian_power_4",
                ()->new BlockItem(Blocks.COMPRESSED_OBSIDIAN_POWER_4.get(), new Item.Properties()));

        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN_POWER_5 = BLOCK_ITEMS.register("compressed_obsidian_power_5",
                ()->new BlockItem(Blocks.COMPRESSED_OBSIDIAN_POWER_5.get(), new Item.Properties()));

        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN_POWER_6 = BLOCK_ITEMS.register("compressed_obsidian_power_6",
                ()->new BlockItem(Blocks.COMPRESSED_OBSIDIAN_POWER_6.get(), new Item.Properties()));

        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN_POWER_7 = BLOCK_ITEMS.register("compressed_obsidian_power_7",
                ()->new BlockItem(Blocks.COMPRESSED_OBSIDIAN_POWER_7.get(), new Item.Properties()));

        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN_POWER_8 = BLOCK_ITEMS.register("compressed_obsidian_power_8",
                ()->new BlockItem(Blocks.COMPRESSED_OBSIDIAN_POWER_8.get(), new Item.Properties()));

        public static final RegistryObject<Item> COMPRESSED_OBSIDIAN_POWER_9 = BLOCK_ITEMS.register("compressed_obsidian_power_9",
                ()->new BlockItem(Blocks.COMPRESSED_OBSIDIAN_POWER_9.get(), new Item.Properties()));

        public static void register(IEventBus eventBus){BLOCK_ITEMS.register(eventBus);}
    }
}
