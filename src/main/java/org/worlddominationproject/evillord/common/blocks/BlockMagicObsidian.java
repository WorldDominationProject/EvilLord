package org.worlddominationproject.evillord.common.blocks;

import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 *
 * @author stranametschty
 *
 */
public class BlockMagicObsidian extends Block {

	public static final String ID = "magic_obsidian";

	public BlockMagicObsidian() {
		super(Material.ROCK);
		this.setRegistryName(EvilLordMod.MODID, ID);
		this.setUnlocalizedName("Magic Obsidian");
		this.setHardness(50.0F);
		this.setResistance(2000.0F);
	}

}
