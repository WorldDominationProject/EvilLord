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
import net.minecraftforge.registries.IForgeRegistry;

/**
 *
 * @author stranametschty
 *
 */
@Mod.EventBusSubscriber(modid = EvilLordMod.MODID)
@ObjectHolder(EvilLordMod.MODID)
public final class Items {

	private static final Logger LOGGER = LogManager.getLogger(Items.class);

	@ObjectHolder(BlockMagicObsidian.ID)
	public static final Item MAGIC_OBSIDIAN = null;

	@ObjectHolder(ItemEvilHand.ID)
	public static final Item EVIL_HAND = null;

	@ObjectHolder(ItemMagicOrb.ID)
	public static final Item MAGIC_ORB = null;

	@ObjectHolder(ItemRuneShard.ID)
	public static final Item RUNE_SHARD = null;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		LOGGER.info("Registering Items");

		IForgeRegistry<Item> itemRegistry = event.getRegistry();

		registerItemBlock(itemRegistry, Blocks.MAGIC_OBSIDIAN);
		registerItemBlock(itemRegistry, Blocks.EVIL_THRONE);
		registerItemBlock(itemRegistry, Blocks.WAR_BANNER);
		registerItemBlock(itemRegistry, Blocks.POSSESSION_TOTEM);

		registerItem(itemRegistry, new ItemEvilHand());
		registerItem(itemRegistry, new ItemMagicOrb());
		registerItem(itemRegistry, new ItemRuneShard());
	}

	private static void registerItemBlock(final IForgeRegistry<Item> registry, final Block block) {
		Item itemBlock = new ItemBlock(block).setRegistryName(block.getRegistryName());
		registry.register(itemBlock);
		EvilLordMod.proxy.initModelResource(itemBlock);
	}

	private static void registerItem(final IForgeRegistry<Item> registry, final Item item) {
		registry.register(item);
		EvilLordMod.proxy.initModelResource(item);
	}

}
