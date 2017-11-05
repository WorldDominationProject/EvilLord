package org.worlddominationproject.evillord.common.items;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.worlddominationproject.evillord.EvilLordMod;
import org.worlddominationproject.evillord.common.blocks.BlockMagicObsidian;
import org.worlddominationproject.evillord.common.blocks.Blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@Mod.EventBusSubscriber(modid = EvilLordMod.MODID)
@ObjectHolder(EvilLordMod.MODID)
public final class Items {

	private static final Logger LOGGER = LogManager.getLogger(Items.class);

	@ObjectHolder(BlockMagicObsidian.ID)
	public static final Item MAGIC_OBSIDIAN = null;

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		LOGGER.info("Register Items");
		Block magicObsidian = Blocks.MAGIC_OBSIDIAN;
		event.getRegistry().register(new ItemBlock(magicObsidian).setRegistryName(magicObsidian.getRegistryName()));
	}

}
