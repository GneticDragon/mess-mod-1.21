package net.gabe.messmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gabe.messmod.MessMod;
import net.gabe.messmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MESS_MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MessMod.MOD_ID, "mess_mod_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.ZENITH))
                    .displayName(Text.translatable("itemgroup.messmod.mess_mod_items"))
                    .entries((displayContext, entries) -> {
                         entries.add(ModItems.ZENITH);
                        entries.add(ModItems.UNREFINED_ZENITH);
                    })
                    .build());

    public static final ItemGroup MESS_MOD_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MessMod.MOD_ID, "mess_mod_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.BLOCK_OF_ZENITH))
                    .displayName(Text.translatable("itemgroup.messmod.mess_mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLOCK_OF_ZENITH);
                        entries.add(ModBlocks.UNREFINED_BLOCK_OF_ZENITH);
                    })
                    .build());

    public static void registerIemGroups() {
        MessMod.LOGGER.info("Registering Item Groups for " + MessMod.MOD_ID);
    }
}
