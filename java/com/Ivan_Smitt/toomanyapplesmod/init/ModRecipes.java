package com.Ivan_Smitt.toomanyapplesmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(Items.APPLE, new ItemStack(ModItems.APPLE_FRIED,1), 1.5f);
	}
}
