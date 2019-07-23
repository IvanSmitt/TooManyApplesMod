package com.Ivan_Smitt.toomanyapplesmod.items.food;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodEffectBase extends FoodBase{

	PotionEffect[] effects = {new PotionEffect(MobEffects.RESISTANCE,30*20,1,false,false)};
	boolean foil;

	public FoodEffectBase(String name,int amount, float saturation,boolean isAnimalFood, PotionEffect[] effects,boolean foil)
	{
		super(name,amount,saturation,isAnimalFood);
		setAlwaysEdible();
		
		this.effects = effects;
		this.foil = foil;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn,EntityPlayer player)
	{
		if(!worldIn.isRemote)
		{
			for(PotionEffect effect : effects)
				player.addPotionEffect(new PotionEffect(effect.getPotion(),effect.getDuration(),effect.getAmplifier(),effect.getIsAmbient(),effect.doesShowParticles()));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return this.foil;
	}
}
