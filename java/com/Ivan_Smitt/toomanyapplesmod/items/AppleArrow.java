package com.Ivan_Smitt.toomanyapplesmod.items;

import com.Ivan_Smitt.toomanyapplesmod.Main;
import com.Ivan_Smitt.toomanyapplesmod.entity.appleArrow.EntityAppleArrow;
import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;
import com.Ivan_Smitt.toomanyapplesmod.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AppleArrow extends ItemArrow implements IHasModel
{

	public AppleArrow(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tomanyapplesmodtab);

		ModItems.ITEMS.add(this);
	}
	
	@Override
	public EntityArrow createArrow(World worldIn,ItemStack stack,EntityLivingBase shooter)
	{
		EntityAppleArrow entityAppleArrow = new EntityAppleArrow(worldIn,shooter);
		return entityAppleArrow;
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");
		
	}
	
}

