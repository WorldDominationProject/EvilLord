package org.worlddominationproject.evillord.common.blocks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(EvilLordMod.MODID)
public class Blocks {

	private static final Logger LOGGER = LogManager.getLogger(Blocks.class);

	@ObjectHolder(BlockMagicObsidian.ID)
	public static final Block MAGIC_OBSIDIAN = null;

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		LOGGER.info("Register Blocks");
		event.getRegistry().register(new BlockMagicObsidian());
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		LOGGER.info("Register Items");
		Block magicObsidian = MAGIC_OBSIDIAN;
		event.getRegistry().register(new ItemBlock(magicObsidian).setRegistryName(magicObsidian.getRegistryName()));
	}

}
