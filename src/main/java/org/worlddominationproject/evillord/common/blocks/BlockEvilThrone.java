package org.worlddominationproject.evillord.common.blocks;

import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 *
 * @author stranametschty
 *
 */
public class BlockEvilThrone extends Block {

	public static final String ID = "evil_throne";

	public BlockEvilThrone() {
		super(Material.ROCK);
		setRegistryName(EvilLordMod.MODID, ID);
		setUnlocalizedName("Evil Throne");
	}
}
