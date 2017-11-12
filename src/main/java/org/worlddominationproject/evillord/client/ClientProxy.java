package org.worlddominationproject.evillord.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.worlddominationproject.evillord.EvilLordMod;
import org.worlddominationproject.evillord.common.CommonProxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

/**
 *
 * @author stranametschty
 *
 */
@Mod.EventBusSubscriber(modid = EvilLordMod.MODID, value = Side.CLIENT)
public class ClientProxy extends CommonProxy {

	private static final Logger LOGGER = LogManager.getLogger(ClientProxy.class);

	@Override
	public void initModelResource(final Item item) {
		if (item == null) {
			LOGGER.warn("Tried to init empty item");
			return;
		}
		LOGGER.info("Registering Model Resource Location for {}", item);
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
