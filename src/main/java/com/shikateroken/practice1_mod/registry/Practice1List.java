package com.shikateroken.practice1_mod.registry;

import net.minecraft.world.item.Item;

import java.util.List;
import java.util.function.Supplier;

public class Practice1List {
    public static final Supplier<List<Supplier<Item>>>items = ()->List.of(
            Practice1items.PRACTICE_INGOT,
            Practice1blocks.BlockItems.COMPRESSED_OBSIDIAN,
            Practice1blocks.BlockItems.COMPRESSED_OBSIDIAN_POWER_2,
            Practice1blocks.BlockItems.COMPRESSED_OBSIDIAN_POWER_3,
            Practice1blocks.BlockItems.COMPRESSED_OBSIDIAN_POWER_4,
            Practice1blocks.BlockItems.COMPRESSED_OBSIDIAN_POWER_5,
            Practice1blocks.BlockItems.COMPRESSED_OBSIDIAN_POWER_6,
            Practice1blocks.BlockItems.COMPRESSED_OBSIDIAN_POWER_7,
            Practice1blocks.BlockItems.COMPRESSED_OBSIDIAN_POWER_8,
            Practice1blocks.BlockItems.COMPRESSED_OBSIDIAN_POWER_9
    );

}
