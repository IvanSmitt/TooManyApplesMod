package com.Ivan_Smitt.toomanyapplesmod.items;

import com.Ivan_Smitt.toomanyapplesmod.Main;
import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;
import com.Ivan_Smitt.toomanyapplesmod.util.IHasModel;

import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class AppleBow extends ItemBow implements IHasModel {

	public AppleBow(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tomanyapplesmodtab);
		setMaxDamage(250);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public int getItemEnchantability()
	{
		return 40;
	}
	
	@Override
	protected boolean isArrow(ItemStack stack)
	{
		return (stack.getItem() == ModItems.APPLE_ARROW);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");
		
	}
}
