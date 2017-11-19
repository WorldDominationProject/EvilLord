package org.worlddominationproject.evillord.common.items;

import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.item.Item;

/**
 *
 * @author stranametschty
 *
 */
public class ItemEvilHand extends Item {

	public static final String ID = "evil_hand";

	public ItemEvilHand() {
		super();
		setRegistryName(EvilLordMod.MODID, ID);
		setUnlocalizedName("Evil Hand");
		setMaxDamage(0);
		setMaxStackSize(1);
	}

}
