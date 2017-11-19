package org.worlddominationproject.evillord.common.blocks;

import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 *
 * @author stranametschty
 *
 */
public class BlockWarBanner extends Block {

	public static final String ID = "war_banner";

	public BlockWarBanner() {
		super(Material.WOOD);
		setRegistryName(EvilLordMod.MODID, ID);
		setUnlocalizedName("War Banner");
	}

}
