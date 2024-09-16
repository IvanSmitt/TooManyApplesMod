package com.Ivan_Smitt.toomanyapplesmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AppleGlowstoneBlock extends BlockBase{

	public AppleGlowstoneBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.GLASS);
		setHardness(1.5F);
		setResistance(100.0F);
		setHarvestLevel("pickaxe",0);
		setLightLevel(50.0F);	
	}

}
