package com.Ivan_Smitt.toomanyapplesmod.blocks;

import java.util.Random;

import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OctoractOreBlock extends BlockBase{

	public OctoractOreBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(40.0F);
		setResistance(100.0F);
		setHarvestLevel("pickaxe",5);
		setLightLevel(1.0F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state,Random rand,int fortune)
	{
		if(rand.nextInt(1000)>500)
		return ModItems.OCTORACT;
		else
		{
			switch(rand.nextInt(10))
			{
				case 1:
					return ModItems.APPLE_BRICK;
				case 2:
					return ModItems.APPLE_COBBLESTONE;
				case 3:
					return ModItems.APPLE_DIAMOND;
				case 4:
					return ModItems.APPLE_EMERALD;
				case 5:
					return ModItems.APPLE_GLOWSTONE;
				case 6:
					return ModItems.APPLE_LAPIS;
				case 7:
					if(rand.nextInt(2000)==1337)
						return ModItems.APPLE_BEDROCK;
					return ModItems.APPLE_SUPER;
				case 8:
					return ModItems.APPLE_QUARTZ;
				case 9:
					return ModItems.APPLE_REDSTONE;
				default:
					return Items.GOLDEN_APPLE;
					
			}
				
		}
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state)
    {
		for(int i=0;i<worldIn.playerEntities.size();i++)
			worldIn.playerEntities.get(i).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS,10*20,0,false,false));
			
    }
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
	{
		if(entityIn instanceof EntityPlayer)
		{
			((EntityPlayer) entityIn).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS,30*20,2,false,false));
			((EntityPlayer) entityIn).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,5*20,50,false,false));
		}
		
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 1;
	}
}
