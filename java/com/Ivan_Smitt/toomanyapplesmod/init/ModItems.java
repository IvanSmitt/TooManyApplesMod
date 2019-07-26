package com.Ivan_Smitt.toomanyapplesmod.init;


import java.util.ArrayList;
import java.util.List;

import com.Ivan_Smitt.toomanyapplesmod.items.FuelBase;
import com.Ivan_Smitt.toomanyapplesmod.items.ItemBase;
import com.Ivan_Smitt.toomanyapplesmod.items.armor.ArmorBase;
import com.Ivan_Smitt.toomanyapplesmod.items.food.FoodBase;
import com.Ivan_Smitt.toomanyapplesmod.items.food.FoodEffectBase;
import com.Ivan_Smitt.toomanyapplesmod.items.tools.ToolAxe;
import com.Ivan_Smitt.toomanyapplesmod.items.tools.ToolHoe;
import com.Ivan_Smitt.toomanyapplesmod.items.tools.ToolOctoract;
import com.Ivan_Smitt.toomanyapplesmod.items.tools.ToolPickaxe;
import com.Ivan_Smitt.toomanyapplesmod.items.tools.ToolSpade;
import com.Ivan_Smitt.toomanyapplesmod.items.tools.ToolSword;
import com.Ivan_Smitt.toomanyapplesmod.util.Reference;

import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import scala.Int;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial MATERIAL_APPLE = EnumHelper.addToolMaterial("material_apple", 2, 360, 6.7F, 2.5F, 50);
	public static final ArmorMaterial ARMOR_MATERIAL_APPLE = EnumHelper.addArmorMaterial("armor_material_apple", Reference.MOD_ID + ":apple", 13, new int[] {2,6,7,2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public static final ToolMaterial MATERIAL_APPLE_DIAMOND = EnumHelper.addToolMaterial("material_apple_diamond", 4, 2548, 13.5F, 4.5F, 50);
	public static final ArmorMaterial ARMOR_MATERIAL_APPLE_DIAMOND = EnumHelper.addArmorMaterial("armor_material_apple_diamond", Reference.MOD_ID + ":apple_diamond", 48, new int[] {3,7,9,4}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	public static final ToolMaterial MATERIAL_BRAGIOT = EnumHelper.addToolMaterial("material_bragiot", 5, 8735, 28.0F, 8.5F, 70);
	public static final ArmorMaterial ARMOR_MATERIAL_BRAGIOT = EnumHelper.addArmorMaterial("armor_material_bragiot", Reference.MOD_ID + ":bragiot", 70, new int[] {5,9,13,6}, 70, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	public static final ToolMaterial MATERIAL_OCTORACT = EnumHelper.addToolMaterial("material_octoract", Int.MaxValue(), Int.MaxValue(), Float.MAX_VALUE , 15.0F,0);
	public static final ArmorMaterial ARMOR_MATERIAL_OCTORACT = EnumHelper.addArmorMaterial("armor_material_octoract", Reference.MOD_ID + ":octoract",Int.MaxValue(), new int[] {20,20,20,20}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);
	
	//Items
	public static final Item BRAGIOT = new ItemBase("bragiot");
	public static final Item OCTORACT = new ItemBase("octoract");
	
	//fuel
	public static final Item APPLE_FRIED = new FuelBase("apple_fried",80);
	public static final Item APPLE_COAL = new FuelBase("apple_coal",15000);
	public static final Item APPLE_COALBLOCK = new FuelBase("apple_coalblock",160000,true);
	
	//Tools
	public static final ItemSword APPLE_SWORD = new ToolSword("apple_sword",MATERIAL_APPLE);
	public static final ItemSpade APPLE_SHOVEL = new ToolSpade("apple_shovel",MATERIAL_APPLE);
	public static final ItemPickaxe APPLE_PICKAXE = new ToolPickaxe("apple_pickaxe",MATERIAL_APPLE);
	public static final ItemAxe APPLE_AXE = new ToolAxe("apple_axe",MATERIAL_APPLE);
	public static final ItemHoe APPLE_HOE = new ToolHoe("apple_hoe",MATERIAL_APPLE);
	
	public static final ItemSword APPLE_DIAMOND_SWORD = new ToolSword("apple_diamond_sword",MATERIAL_APPLE_DIAMOND);
	public static final ItemSpade APPLE_DIAMOND_SHOVEL = new ToolSpade("apple_diamond_shovel",MATERIAL_APPLE_DIAMOND);
	public static final ItemPickaxe APPLE_DIAMOND_PICKAXE = new ToolPickaxe("apple_diamond_pickaxe",MATERIAL_APPLE_DIAMOND);
	public static final ItemAxe APPLE_DIAMOND_AXE = new ToolAxe("apple_diamond_axe",MATERIAL_APPLE_DIAMOND);
	public static final ItemHoe APPLE_DIAMOND_HOE = new ToolHoe("apple_diamond_hoe",MATERIAL_APPLE_DIAMOND);
	
	public static final ItemSword BRAGIOT_SWORD = new ToolSword("bragiot_sword",MATERIAL_BRAGIOT);
	public static final ItemSpade BRAGIOT_SHOVEL = new ToolSpade("bragiot_shovel",MATERIAL_BRAGIOT);
	public static final ItemPickaxe BRAGIOT_PICKAXE = new ToolPickaxe("bragiot_pickaxe",MATERIAL_BRAGIOT);
	public static final ItemAxe BRAGIOT_AXE = new ToolAxe("bragiot_axe",MATERIAL_BRAGIOT);
	public static final ItemHoe BRAGIOT_HOE = new ToolHoe("bragiot_hoe",MATERIAL_BRAGIOT);
	
	public static final ItemTool OCTORACT_TOOL = new ToolOctoract("octoract_tool",MATERIAL_OCTORACT,ModItems.OCTORACT);
	
	//Armor
	public static final Item APPLE_HELMET = new ArmorBase("apple_helmet",ARMOR_MATERIAL_APPLE,1,EntityEquipmentSlot.HEAD);
	public static final Item APPLE_CHESTPLATE = new ArmorBase("apple_chestplate",ARMOR_MATERIAL_APPLE,1,EntityEquipmentSlot.CHEST);
	public static final Item APPLE_LEGGINGS = new ArmorBase("apple_leggings",ARMOR_MATERIAL_APPLE,2,EntityEquipmentSlot.LEGS);
	public static final Item APPLE_BOOTS = new ArmorBase("apple_boots",ARMOR_MATERIAL_APPLE,1,EntityEquipmentSlot.FEET);
	
	public static final Item APPLE_DIAMOND_HELMET = new ArmorBase("apple_diamond_helmet",ARMOR_MATERIAL_APPLE_DIAMOND,1,EntityEquipmentSlot.HEAD);
	public static final Item APPLE_DIAMOND_CHESTPLATE = new ArmorBase("apple_diamond_chestplate",ARMOR_MATERIAL_APPLE_DIAMOND,1,EntityEquipmentSlot.CHEST);
	public static final Item APPLE_DIAMOND_LEGGINGS = new ArmorBase("apple_diamond_leggings",ARMOR_MATERIAL_APPLE_DIAMOND,2,EntityEquipmentSlot.LEGS);
	public static final Item APPLE_DIAMOND_BOOTS = new ArmorBase("apple_diamond_boots",ARMOR_MATERIAL_APPLE_DIAMOND,1,EntityEquipmentSlot.FEET);
	
	public static final Item BRAGIOT_HELMET = new ArmorBase("bragiot_helmet",ARMOR_MATERIAL_BRAGIOT,1,EntityEquipmentSlot.HEAD);
	public static final Item BRAGIOT_CHESTPLATE = new ArmorBase("bragiot_chestplate",ARMOR_MATERIAL_BRAGIOT,1,EntityEquipmentSlot.CHEST);
	public static final Item BRAGIOT_LEGGINGS = new ArmorBase("bragiot_leggings",ARMOR_MATERIAL_BRAGIOT,2,EntityEquipmentSlot.LEGS);
	public static final Item BRAGIOT_BOOTS = new ArmorBase("bragiot_boots",ARMOR_MATERIAL_BRAGIOT,1,EntityEquipmentSlot.FEET);
	
	public static final Item OCTORACT_HELMET = new ArmorBase("octoract_helmet",ARMOR_MATERIAL_OCTORACT,1,EntityEquipmentSlot.HEAD);
	public static final Item OCTORACT_CHESTPLATE = new ArmorBase("octoract_chestplate",ARMOR_MATERIAL_OCTORACT,1,EntityEquipmentSlot.CHEST);
	public static final Item OCTORACT_LEGGINGS = new ArmorBase("octoract_leggings",ARMOR_MATERIAL_OCTORACT,2,EntityEquipmentSlot.LEGS);
	public static final Item OCTORACT_BOOTS = new ArmorBase("octoract_boots",ARMOR_MATERIAL_OCTORACT,1,EntityEquipmentSlot.FEET);
	
	//Food
	public static final Item APPLE_DIRT = new FoodEffectBase("apple_dirt",3,0.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.NAUSEA,20*20,0,false,true)},false);
	public static final Item APPLE_COBBLESTONE = new FoodEffectBase("apple_cobblestone",3,2.4f,false,new PotionEffect[] {new PotionEffect(MobEffects.RESISTANCE,10*20,0,false,true)},false);//
	
	public static final Item APPLE_STONE = new FoodEffectBase("apple_stone",3,2.4f,false,new PotionEffect[] {new PotionEffect(MobEffects.RESISTANCE,30*20,0,false,true)},false);
	public static final Item APPLE_OBSIDIAN = new FoodEffectBase("apple_obsidian",5,15.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.RESISTANCE,60*20,2,false,true),new PotionEffect(MobEffects.FIRE_RESISTANCE,300*20,1,false,true),new PotionEffect(MobEffects.BLINDNESS,2*20,0,false,true)},false);
	public static final Item APPLE_GLOWSTONE = new FoodEffectBase("apple_glowstone",1,12.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.GLOWING,60*20,0,false,true),new PotionEffect(MobEffects.ABSORPTION,60*20,0,false,true)},false);
	public static final Item APPLE_GLOWSTONEBLOCK = new FoodEffectBase("apple_glowstoneblock",4,50.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.GLOWING,500*20,0,false,true),new PotionEffect(MobEffects.ABSORPTION,500*20,4,false,true)},true);
	public static final Item APPLE_SUPER = new FoodEffectBase("apple_super",20,20.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.INSTANT_HEALTH,1*20,2,false,true)},true);
	public static final Item APPLE_BEDROCK = new FoodEffectBase("apple_bedrock",0,0.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.FIRE_RESISTANCE,10000*20,2,false,true),new PotionEffect(MobEffects.RESISTANCE,10000*20,2,false,true)},false);
	public static final Item APPLE_BRICK = new FoodEffectBase("apple_brick",3,2.4f,false,new PotionEffect[] {new PotionEffect(MobEffects.RESISTANCE,30*20,0,false,true),new PotionEffect(MobEffects.HEALTH_BOOST,180*20,1,false,true)},false);
	public static final Item APPLE_BRICKBLOCK = new FoodEffectBase("apple_brickblock",6,7.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.RESISTANCE,180*20,0,false,true),new PotionEffect(MobEffects.HEALTH_BOOST,500*20,1,false,true)},true);
	
	public static final Item APPLE_DIAMOND = new FoodEffectBase("apple_diamond",7,7.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.HASTE,60*20,0,false,true),new PotionEffect(MobEffects.JUMP_BOOST,60*20,0,false,true),new PotionEffect(MobEffects.SPEED,60*20,0,false,true),new PotionEffect(MobEffects.NIGHT_VISION,60*20,0,false,true),new PotionEffect(MobEffects.STRENGTH,60*20,0,false,true),new PotionEffect(MobEffects.WATER_BREATHING,60*20,0,false,true)},false);
	public static final Item APPLE_DIAMONDBLOCK = new FoodEffectBase("apple_diamondblock",20,14.4f,false,new PotionEffect[] {new PotionEffect(MobEffects.HASTE,600*20,2,false,true),new PotionEffect(MobEffects.JUMP_BOOST,600*20,2,false,true),new PotionEffect(MobEffects.SPEED,600*20,2,false,true),new PotionEffect(MobEffects.NIGHT_VISION,600*20,0,false,true),new PotionEffect(MobEffects.STRENGTH,600*20,2,false,true),new PotionEffect(MobEffects.WATER_BREATHING,600*20,0,false,true)},true);
	
	public static final Item APPLE_EMERALD = new FoodEffectBase("apple_emerald",5,4.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.LEVITATION,5*20,0,false,true),new PotionEffect(MobEffects.WATER_BREATHING,40*20,0,false,true),new PotionEffect(MobEffects.GLOWING,5*20,0,false,true),new PotionEffect(MobEffects.ABSORPTION,60*20,0,false,true)},false);
	public static final Item APPLE_EMERALDBLOCK = new FoodEffectBase("apple_emeraldblock",8,20.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.LEVITATION,7*20,0,false,true),new PotionEffect(MobEffects.WATER_BREATHING,1000*20,0,false,true),new PotionEffect(MobEffects.GLOWING,7*20,0,false,true),new PotionEffect(MobEffects.ABSORPTION,300*20,4,false,true)},true);
	
	public static final Item APPLE_ENDSTONE = new FoodEffectBase("apple_endstone",8,2.4f,false,new PotionEffect[] {},false);
	
	
	
	public static final Item APPLE_IRON = new FoodEffectBase("apple_iron",5,2.8f,false,new PotionEffect[] {new PotionEffect(MobEffects.HASTE,40*20,1,false,true)},false);
	public static final Item APPLE_IRONBLOCK = new FoodEffectBase("apple_ironblock",10,4.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.HASTE,400*20,3,false,true)},true);
	
	public static final Item APPLE_LAPIS = new FoodEffectBase("apple_lapis",4,2.8f,false,new PotionEffect[] {new PotionEffect(MobEffects.LUCK,40*20,0,false,true),new PotionEffect(MobEffects.NIGHT_VISION,40*20,0,false,true)},false); 
	public static final Item APPLE_LAPISBLOCK = new FoodEffectBase("apple_lapisblock",6,2.8f,false,new PotionEffect[] {new PotionEffect(MobEffects.LUCK,800*20,0,false,true),new PotionEffect(MobEffects.NIGHT_VISION,300*20,0,false,true)},true);
	
	public static final Item APPLE_PLANKS = new FoodEffectBase("apple_planks",0,0.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.REGENERATION,5*20,0,false,true)},false);
	public static final Item APPLE_LOG = new FoodEffectBase("apple_log",0,0.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.REGENERATION,5*20,1,false,true)},true);
	
	public static final Item APPLE_QUARTZ = new FoodEffectBase("apple_quartz",4,3.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.STRENGTH,50*20,1,false,true)},false);
	public static final Item APPLE_QUARTZBLOCK = new FoodEffectBase("apple_quartzblock",10,6.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.STRENGTH,550*20,3,false,true)},true);
	
	public static final Item APPLE_NETHERRACK = new FoodEffectBase("apple_netherrack",2,3.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.FIRE_RESISTANCE,30*20,1,false,true)},false);
	
	public static final Item APPLE_SOUL_SAND = new FoodEffectBase("apple_soul_sand",8,3.0f,false,new PotionEffect[] {new PotionEffect(MobEffects.FIRE_RESISTANCE,200*20,1,false,true),new PotionEffect(MobEffects.HUNGER,30*20,50,false,true)},false);
	
	public static final Item APPLE_REDSTONE = new FoodEffectBase("apple_redstone",4,3.5f,false,new PotionEffect[] {new PotionEffect(MobEffects.SPEED,15*20,2,false,true)},false);
	public static final Item APPLE_REDSTONEBLOCK = new FoodEffectBase("apple_redstoneblock",5,3.8f,false,new PotionEffect[] {new PotionEffect(MobEffects.SPEED,100*20,5,false,true)},true);
	
	public static final Item APPLE_WOOL = new FoodEffectBase("apple_wool",7,2.4f,false,new PotionEffect[] {},false);
	
	public static final Item APPLE_SLIME = new FoodEffectBase("apple_slime",4,3.5f,false,new PotionEffect[] {new PotionEffect(MobEffects.JUMP_BOOST,45*20,2,false,true)},false);
	public static final Item APPLE_SLIMEBLOCK = new FoodEffectBase("apple_slimeblock",5,3.8f,false,new PotionEffect[] {new PotionEffect(MobEffects.JUMP_BOOST,300*20,5,false,true)},true);
	
	public static final Item APPLE_SPONGE = new FoodEffectBase("apple_sponge",6,3.5f,false,new PotionEffect[] {new PotionEffect(MobEffects.WATER_BREATHING,1000*20,0,false,true)},false);
	
	public static final Item APPLE_SAND = new FoodEffectBase("apple_sand",4,3.5f,false,new PotionEffect[] {new PotionEffect(MobEffects.HUNGER,60*20,0,false,true),new PotionEffect(MobEffects.ABSORPTION,200*20,0,false,true)},false);
	
	public static final Item APPLE_ICE = new FoodEffectBase("apple_ice",8,3.5f,false,new PotionEffect[] {new PotionEffect(MobEffects.FIRE_RESISTANCE,120*20,0,false,true)},false);
	
	public static final Item APPLE_TNT = new FoodEffectBase("apple_tnt",6,3.5f,false,new PotionEffect[] {new PotionEffect(MobEffects.INSTANT_DAMAGE,1*20,2,false,true),new PotionEffect(MobEffects.HEALTH_BOOST,500*20,2,false,true)},false);
	
	
	public static void initRepairs() {
		
		MATERIAL_APPLE.setRepairItem(new ItemStack(Items.APPLE));
		ARMOR_MATERIAL_APPLE.setRepairItem(new ItemStack(Items.APPLE));
		MATERIAL_APPLE_DIAMOND.setRepairItem(new ItemStack(ModItems.APPLE_DIAMOND));
		ARMOR_MATERIAL_APPLE_DIAMOND.setRepairItem(new ItemStack(ModItems.APPLE_DIAMOND));
		
		MATERIAL_BRAGIOT.setRepairItem(new ItemStack(ModItems.BRAGIOT));
		ARMOR_MATERIAL_BRAGIOT.setRepairItem(new ItemStack(ModItems.BRAGIOT));
		MATERIAL_OCTORACT.setRepairItem(new ItemStack(ModItems.OCTORACT));
		ARMOR_MATERIAL_OCTORACT.setRepairItem(new ItemStack(ModItems.OCTORACT));
	}
	
}


