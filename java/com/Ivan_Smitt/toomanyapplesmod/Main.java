package com.Ivan_Smitt.toomanyapplesmod;

import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;
import com.Ivan_Smitt.toomanyapplesmod.init.ModRecipes;
import com.Ivan_Smitt.toomanyapplesmod.proxy.CommonProxy;
import com.Ivan_Smitt.toomanyapplesmod.tabs.TooManyApplesModTab;
import com.Ivan_Smitt.toomanyapplesmod.util.Reference;
import com.Ivan_Smitt.toomanyapplesmod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name=Reference.NAME, version = Reference.VERSION)
public class Main {

	
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs tomanyapplesmodtab = new TooManyApplesModTab("tomanyapplesmodtab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide =Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(),3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		ModItems.initRepairs();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
