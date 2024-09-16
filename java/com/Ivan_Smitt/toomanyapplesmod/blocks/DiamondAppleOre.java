package com.Ivan_Smitt.toomanyapplesmod.blocks;

import java.util.Random;

import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class DiamondAppleOre extends BlockBase{

	public DiamondAppleOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(6.0F);
		setResistance(100.0F);
		setHarvestLevel("pickaxe",3);
	}
	
	@Override
	public Item getItemDropped(IBlockState state,Random rand,int fortune)
	{
		return ModItems.APPLE_DIAMOND;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 1;
	}

}
