package org.worlddominationproject.evillord.common.items;

import org.worlddominationproject.evillord.EvilLordMod;

import net.minecraft.item.Item;

/**
 *
 * @author stranametschty
 *
 */
public class ItemMagicOrb extends Item {

	public static final String ID = "magic_orb";

	public ItemMagicOrb() {
		super();
		setRegistryName(EvilLordMod.MODID, ID);
		setUnlocalizedName("Magic Orb");
		setMaxDamage(0);
		setMaxStackSize(128);
	}

}
