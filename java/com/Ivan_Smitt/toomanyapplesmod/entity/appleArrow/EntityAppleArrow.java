package com.Ivan_Smitt.toomanyapplesmod.entity.appleArrow;

import java.util.Random;

import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityAppleArrow extends EntityArrow{

	public EntityAppleArrow(World worldIn) {
		super(worldIn);
	}
	
	public EntityAppleArrow(World worldIn, double x,double y,double z) {
		super(worldIn,x,y,z);
	}
	
	public EntityAppleArrow(World worldIn,EntityLivingBase shooter) {
		super(worldIn,shooter);
	}

	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ModItems.APPLE_ARROW);
	}
	
	@Override
	protected void arrowHit(EntityLivingBase living)
	{
		super.arrowHit(living);
	}
	
	@Override
	public void onUpdate() 
	{
		super.onUpdate();
		if(this.world.isRemote)
		{
			if(this.inGround)
			{
			}
			else
			{
				this.spawnParticles(2);
			}
		}
	}
	
	private void spawnParticles(int particleCount)
	{
		Random rand = new Random();
		int i = rand.nextInt(15);
		double d0 = (double)(i >> 16 & 255) / 255.0D;
		double d1 = (double)(i >> 8 & 255) / 255.0D;
		double d2 = (double)(i >> 0 & 255) / 255.0D;
		for(int j = 0; j < particleCount; ++j)
		{
			this.world.spawnParticle(EnumParticleTypes.CRIT, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, d0, d1, d2);
		}
}
	
}
