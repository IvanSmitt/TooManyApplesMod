package com.Ivan_Smitt.toomanyapplesmod.entity.appleArrow;

import com.Ivan_Smitt.toomanyapplesmod.util.Reference;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAppleArrow extends RenderArrow<EntityAppleArrow>{
	
	public RenderAppleArrow(RenderManager renderManagerIn)
	{
		super(renderManagerIn);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityAppleArrow entity) {
		return new ResourceLocation(Reference.MOD_ID + ":textures/entity/arrows/apple_arrow.png");
	}

}
