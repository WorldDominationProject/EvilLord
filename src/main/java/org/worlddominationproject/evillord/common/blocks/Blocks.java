package org.worlddominationproject.evillord.common.blocks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@Mod.EventBusSubscriber(modid = EvilLordMod.MODID)
@ObjectHolder(EvilLordMod.MODID)
public final class Blocks {

	private static final Logger LOGGER = LogManager.getLogger(Blocks.class);

	@ObjectHolder(BlockMagicObsidian.ID)
	public static final Block MAGIC_OBSIDIAN = null;

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		LOGGER.info("Register Blocks");
		event.getRegistry().register(new BlockMagicObsidian());
	}

}
