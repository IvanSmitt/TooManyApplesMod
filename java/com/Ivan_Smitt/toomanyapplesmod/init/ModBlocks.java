package com.Ivan_Smitt.toomanyapplesmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Ivan_Smitt.toomanyapplesmod.blocks.AppleGlowstoneBlock;
import com.Ivan_Smitt.toomanyapplesmod.blocks.AppleOreBlock;
import com.Ivan_Smitt.toomanyapplesmod.blocks.BlockBase;
import com.Ivan_Smitt.toomanyapplesmod.blocks.BragiotOreBlock;
import com.Ivan_Smitt.toomanyapplesmod.blocks.OctoractOreBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block APPLE_BLOCK = new BlockBase("apple_block",Material.WOOD);
	public static final Block APPLE_GLOWSTONE_BLOCK = new AppleGlowstoneBlock("apple_glowstone_block",Material.GLASS);
	public static final Block APPLE_ORE_BLOCK = new AppleOreBlock("apple_ore_block",Material.ROCK);
	public static final Block BRAGIOT_ORE_BLOCK = new BragiotOreBlock("bragiot_ore_block",Material.ROCK);
	public static final Block OCTORACT_ORE_BLOCK = new OctoractOreBlock("octoract_ore_block",Material.ROCK);
}
