package com.Ivan_Smitt.toomanyapplesmod.world;

import java.util.Random;

import com.Ivan_Smitt.toomanyapplesmod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random,int chunkX,int chunkZ, World world,IChunkGenerator chunkGenerator ,IChunkProvider chunkProvider)
	{
		if(world.provider.getDimension() == 0) {
			generateOverworld(random,chunkX,chunkZ,world,chunkGenerator,chunkProvider);
		}
		else if(world.provider.getDimension() == -1)
		{
			generateNether(random,chunkX,chunkZ,world,chunkGenerator,chunkProvider);
		}
	}
	
	private void generateOverworld(Random random,int chunkX,int chunkZ, World world,IChunkGenerator chunkGenerator ,IChunkProvider chunkProvider)
	{
		generateOre(ModBlocks.APPLE_ORE_BLOCK.getDefaultState(),world,random,chunkX*16,chunkZ*16,5,128,random.nextInt(3)+1,3);
		generateOre(ModBlocks.APPLE_ORE_BLOCK.getDefaultState(),world,random,chunkX*16,chunkZ*16,10,64,random.nextInt(6)+3,3);
		generateOre(ModBlocks.APPLE_ORE_BLOCK.getDefaultState(),world,random,chunkX*16,chunkZ*16,24,30,random.nextInt(6)+3,4);
		generateOre(ModBlocks.BRAGIOT_ORE_BLOCK.getDefaultState(),world,random,chunkX*16,chunkZ*16,2,6,random.nextInt(5)+1,3);
		generateOre(ModBlocks.OCTORACT_ORE_BLOCK.getDefaultState(),world,random,chunkX*16,chunkZ*16,2,5,random.nextInt(5),1);
	}
	
	private void generateNether(Random random,int chunkX,int chunkZ, World world,IChunkGenerator chunkGenerator ,IChunkProvider chunkProvider)
	{
		generateOre(ModBlocks.GOLDEN_APPLE_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,5,128,random.nextInt(2)+2,7,Blocks.NETHERRACK);
		generateOre(ModBlocks.DIAMOND_APPLE_ORE.getDefaultState(),world,random,chunkX*16,chunkZ*16,5,128,random.nextInt(2)+2,5,Blocks.NETHER_BRICK);
	}
	
	private void generateOre(IBlockState ore, World world, Random random,int x,int z,int minY,int maxY,int size,int chances)
	{
		generateOre(ore,world,random,x,z,minY,maxY,size,chances,Blocks.STONE);
	}
	
	private void generateOre(IBlockState ore, World world, Random random,int x,int z,int minY,int maxY,int size,int chances,Block block)
	{
		int deltaY = maxY-minY;
		for(int i =0;i<chances;i++)
		{
			WorldGenMinable generator;
			BlockPos pos = new BlockPos(x+random.nextInt(16),minY+random.nextInt(deltaY),z+random.nextInt(16));
			generator = new WorldGenMinable(ore,size,BlockMatcher.forBlock(block));
			generator.generate(world,random,pos);
		}
	}
}
