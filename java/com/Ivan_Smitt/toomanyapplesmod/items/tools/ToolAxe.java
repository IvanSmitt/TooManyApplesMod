package com.Ivan_Smitt.toomanyapplesmod.items.tools;

import com.Ivan_Smitt.toomanyapplesmod.Main;
import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;
import com.Ivan_Smitt.toomanyapplesmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel{

	public ToolAxe(String name,ToolMaterial material)
	{
		super(material,6.0F,-3.2F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tomanyapplesmodtab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");
		
	}
}
