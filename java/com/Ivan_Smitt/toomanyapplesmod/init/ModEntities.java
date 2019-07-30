package com.Ivan_Smitt.toomanyapplesmod.init;

import com.Ivan_Smitt.toomanyapplesmod.Main;
import com.Ivan_Smitt.toomanyapplesmod.entity.appleArrow.EntityAppleArrow;
import com.Ivan_Smitt.toomanyapplesmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	
	public static void registerEntities()
	{
	
		registerArrow("apple_arrow", EntityAppleArrow.class, Reference.ENTITY_APPLE_ARROW);
		
	}
	
	private static void registerArrow(String name, Class<? extends Entity> entity, int id)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, 64, 20, true);
	}
}
