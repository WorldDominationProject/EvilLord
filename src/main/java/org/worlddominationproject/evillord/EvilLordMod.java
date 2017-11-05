package org.worlddominationproject.evillord;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EvilLordMod.MODID, name = EvilLordMod.NAME, version = EvilLordMod.VERSION)
public class EvilLordMod {

	private static final Logger LOGGER = LogManager.getLogger(EvilLordMod.class);

	public static final String MODID = "evillord";
	public static final String NAME = "Evil Lord";
	public static final String VERSION = "0.0.1";

	@Instance
	public static EvilLordMod instance = new EvilLordMod();

	@EventHandler
	public void preInit(final FMLPreInitializationEvent event) {
		LOGGER.info("Mod pre initialization {}", event.getSide());
	}

	@EventHandler
	public void init(final FMLInitializationEvent event) {
		LOGGER.info("Mod initialization {}", event.getSide());
	}

	@EventHandler
	public void postInit(final FMLPostInitializationEvent event) {
		LOGGER.info("Mod post initialization {}", event.getSide());
	}

}
