package com.Ivan_Smitt.toomanyapplesmod.util.handlers;

import com.Ivan_Smitt.toomanyapplesmod.entity.appleArrow.EntityAppleArrow;
import com.Ivan_Smitt.toomanyapplesmod.entity.appleArrow.RenderAppleArrow;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHandler 
{
	public static void registerEntityRenders()
	{	
		RenderingRegistry.registerEntityRenderingHandler(EntityAppleArrow.class, new IRenderFactory<EntityAppleArrow>() 
		{
			@Override
			public Render<? super EntityAppleArrow> createRenderFor(RenderManager manager) 
			{
				return new RenderAppleArrow(manager);
			}
		});
	}
}
