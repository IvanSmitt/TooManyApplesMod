package com.Ivan_Smitt.toomanyapplesmod.items;

import com.Ivan_Smitt.toomanyapplesmod.Main;
import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;
import com.Ivan_Smitt.toomanyapplesmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FuelBase extends Item implements IHasModel{

	int BurnTime;
	boolean foil=false;
	public FuelBase(String name,int BurnTime)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tomanyapplesmodtab);
		this.BurnTime = BurnTime;
		ModItems.ITEMS.add(this);
	}
	
	public FuelBase(String name,int BurnTime,boolean foil)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tomanyapplesmodtab);
		this.BurnTime = BurnTime;
		ModItems.ITEMS.add(this);
		
		this.foil =foil;
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");
		
	}
	
	public int getItemBurnTime(ItemStack itemStack)
	{
		return BurnTime;
	}
	

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return this.foil;
	}

}
