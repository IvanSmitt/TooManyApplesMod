package com.Ivan_Smitt.toomanyapplesmod.blocks;

import com.Ivan_Smitt.toomanyapplesmod.Main;
import com.Ivan_Smitt.toomanyapplesmod.init.ModBlocks;
import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;
import com.Ivan_Smitt.toomanyapplesmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name,Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
		
	}
}
