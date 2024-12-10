package net.gabe.messmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gabe.messmod.MessMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLOCK_OF_ZENITH = registerBlock("block_of_zenith",
            new Block(AbstractBlock.Settings.create()
                    .strength(5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block UNREFINED_BLOCK_OF_ZENITH =registerBlock("unrefined_block_of_zenith",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .suffocates(Blocks::never)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MessMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MessMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MessMod.LOGGER.info("Registering Mod Blocks for " + MessMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLOCK_OF_ZENITH);
            fabricItemGroupEntries.add(UNREFINED_BLOCK_OF_ZENITH);
        });
    }
}
