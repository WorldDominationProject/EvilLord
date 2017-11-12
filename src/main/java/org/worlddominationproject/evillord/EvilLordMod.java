package org.worlddominationproject.evillord;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.worlddominationproject.evillord.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EvilLordMod.MODID, name = EvilLordMod.NAME, version = EvilLordMod.VERSION, acceptedMinecraftVersions = EvilLordMod.ACCEPTED_MINECRAFT_VERSIONS)
public class EvilLordMod {
	private static final Logger LOGGER = LogManager.getLogger(EvilLordMod.class);

	private static final String CLIENT_PROXY_CLASSNAME = "org.worlddominationproject.evillord.client.ClientProxy";
	private static final String COMMON_PROXY_CLASSNAME = "org.worlddominationproject.evillord.common.CommonProxy";

	public static final String MODID = "evillord";
	public static final String NAME = "Evil Lord";
	public static final String VERSION = "0.0.1";
	public static final String ACCEPTED_MINECRAFT_VERSIONS = "1.12.2";

	@Instance
	public static EvilLordMod instance = new EvilLordMod();

	@SidedProxy(serverSide = COMMON_PROXY_CLASSNAME, clientSide = CLIENT_PROXY_CLASSNAME)
	public static CommonProxy proxy;

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
