package org.worlddominationproject.evillord.common.blocks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

/**
 *
 * @author stranametschty
 *
 */
@Mod.EventBusSubscriber(modid = EvilLordMod.MODID)
@ObjectHolder(EvilLordMod.MODID)
public final class Blocks {

	private static final Logger LOGGER = LogManager.getLogger(Blocks.class);

	@ObjectHolder(BlockMagicObsidian.ID)
	public static final Block MAGIC_OBSIDIAN = null;

	@ObjectHolder(BlockEvilThrone.ID)
	public static final Block EVIL_THRONE = null;

	@ObjectHolder(BlockWarBanner.ID)
	public static final Block WAR_BANNER = null;

	@ObjectHolder(BlockPossessionTotem.ID)
	public static final Block POSSESSION_TOTEM = null;

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		LOGGER.info("Register Blocks");

		IForgeRegistry<Block> blockRegistry = event.getRegistry();

		blockRegistry.register(new BlockMagicObsidian());
		blockRegistry.register(new BlockEvilThrone());
		blockRegistry.register(new BlockWarBanner());
		blockRegistry.register(new BlockPossessionTotem());
	}

}
