package net.gabe.messmod;

import net.fabricmc.api.ModInitializer;

import net.gabe.messmod.block.ModBlocks;
import net.gabe.messmod.item.ModItemGroups;
import net.gabe.messmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessMod implements ModInitializer {
	public static final String MOD_ID = "messmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerIemGroups();
	}
}