package com.Ivan_Smitt.toomanyapplesmod.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class AppleOreBlock extends BlockBase {

	public AppleOreBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe",1);
	}
	
	@Override
	public Item getItemDropped(IBlockState state,Random rand,int fortune)
	{
		if(rand.nextInt(1000)>995)
			return Items.GOLDEN_APPLE;
		return Items.APPLE;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return rand.nextInt(2)+1;
	}
}
