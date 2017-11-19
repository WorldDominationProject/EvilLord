package org.worlddominationproject.evillord.common.blocks;

import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 *
 * @author stranametschty
 *
 */
public class BlockPossessionTotem extends Block {
	public static final String ID = "possession_totem";

	public BlockPossessionTotem() {
		super(Material.WOOD);
		setRegistryName(EvilLordMod.MODID, ID);
		setUnlocalizedName("Possession Totem");
	}

}
