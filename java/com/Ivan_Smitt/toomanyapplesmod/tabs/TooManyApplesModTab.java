package com.Ivan_Smitt.toomanyapplesmod.tabs;

import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TooManyApplesModTab extends CreativeTabs{

	public TooManyApplesModTab(String label) {
		super("toomanyapplesmodtab");
		this.setBackgroundImageName("toomanyapplesmodtab.png");
		this.setNoTitle();

	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.APPLE_SUPER);
	}

}
