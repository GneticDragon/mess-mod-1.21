package net.gabe.messmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gabe.messmod.MessMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ZENITH = registerItem("zenith", new Item(new Item.Settings()));
    public static final Item UNREFINED_ZENITH = registerItem("unrefined_zenith", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MessMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MessMod.LOGGER.info("Registering items for " + MessMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ZENITH);
            entries.add(UNREFINED_ZENITH);
        });
    }
}

