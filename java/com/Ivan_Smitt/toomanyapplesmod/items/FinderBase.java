package com.Ivan_Smitt.toomanyapplesmod.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.audio.Sound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class FinderBase extends ItemBase {

	public FinderBase(String name) {
		super(name);
		
		this.maxStackSize =1;
		this.bFull3D =true;
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		double dist=30.0d;
		for(int x=-10;x<=10;x++)
		{
			for(int y=-10;y<=10;y++)
			{
				for(int z=-10;z<=10;z++)
				{
					if(worldIn.getBlockState(new BlockPos(playerIn.posX+x,playerIn.posY+y,playerIn.posZ+z)).getBlock() == Blocks.DIAMOND_ORE)
					{
						double temp = Math.sqrt(x*x+y*y+z*z);
						if(temp<dist)
						{
							dist=temp;
						}
					}
				}
			}
		}
		final double DISTANCE_FINAL = dist;
		new Thread()
		{
			public void run(){
					try {
						worldIn.playSound(playerIn, playerIn.getPosition(), SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON, SoundCategory.PLAYERS, 1.0F, 1.0F);
						Thread.sleep(Math.round(DISTANCE_FINAL*100));
						worldIn.playSound(playerIn, playerIn.getPosition(), SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundCategory.PLAYERS, 1.0F, 1.0F);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
		}.start();
		
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }
}
