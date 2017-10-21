package org.worlddominationproject.evillord.common.blocks;

import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMagicObsidian extends Block {

	public static final String ID = "magic_obsidian";

	public BlockMagicObsidian() {
		super(Material.ROCK);
		this.setHardness(50.0F);
		this.setResistance(2000.0F);
		this.setUnlocalizedName("Magic Obsidian");
		this.setRegistryName(EvilLordMod.MODID, BlockMagicObsidian.ID);
	}

}
