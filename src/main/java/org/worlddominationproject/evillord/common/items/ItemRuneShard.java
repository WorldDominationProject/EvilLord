package org.worlddominationproject.evillord.common.items;

import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.item.Item;

/**
 *
 * @author stranametschty
 *
 */
public class ItemRuneShard extends Item {

	public static final String ID = "rune_shard";

	public ItemRuneShard() {
		super();
		setRegistryName(EvilLordMod.MODID, ID);
		setUnlocalizedName("Rune Shard");
		setMaxDamage(0);
		setMaxStackSize(4);
	}

}
