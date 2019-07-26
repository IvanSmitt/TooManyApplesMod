package com.Ivan_Smitt.toomanyapplesmod.items.tools;

import com.Ivan_Smitt.toomanyapplesmod.Main;
import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;
import com.Ivan_Smitt.toomanyapplesmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel {

	public ToolSpade(String name,ToolMaterial material)
	{
		super(material);
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
