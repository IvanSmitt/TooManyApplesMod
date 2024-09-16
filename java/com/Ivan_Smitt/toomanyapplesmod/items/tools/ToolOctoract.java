package com.Ivan_Smitt.toomanyapplesmod.items.tools;

import java.util.Collections;
import java.util.Set;

import com.Ivan_Smitt.toomanyapplesmod.Main;
import com.Ivan_Smitt.toomanyapplesmod.init.ModItems;
import com.Ivan_Smitt.toomanyapplesmod.util.IHasModel;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ToolOctoract extends ItemTool implements IHasModel{
	
	    public Item repairItem;
	    public static float attack_speed = 1.8F;
	    public static float base_damage = 3.0F;
	    public static final Set<Block> BLOCKS = Sets.newHashSet();
	 
	    public ToolOctoract(String name, ToolMaterial material, Item repairItem) {
	        super(base_damage, attack_speed, material, BLOCKS);
	        
	        this.setHarvestLevel("pickaxe", material.getHarvestLevel());
	        this.setHarvestLevel("axe", material.getHarvestLevel());
	        this.setHarvestLevel("spade", material.getHarvestLevel());
	        this.setHarvestLevel("hoe", material.getHarvestLevel());
	        this.setHarvestLevel("sword", material.getHarvestLevel());
	        this.repairItem = repairItem;
	        
	        setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.tomanyapplesmodtab);
			
			ModItems.ITEMS.add(this);
	    }
	 
	    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
	    {
	        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

	        if (!worldIn.isRemote)
	        {
	            worldIn.setBlockState(pos, state, 11);
	            player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS,20,0,false,false));
	            stack.damageItem(1, player);
	        }
	    }
	    
	    @SuppressWarnings("incomplete-switch")
	    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
	        ItemStack itemstack = player.getHeldItem(hand);

	        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
	            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

	            for(int x=-1;x<=1;x++)
	            {
	            	for(int z=-1;z<=1;z++)
	            	{
	            		BlockPos temp =new BlockPos(pos.getX()+x,pos.getY(),pos.getZ()+z);
	            		IBlockState iblockstate = worldIn.getBlockState(temp);
	    	            Block block = iblockstate.getBlock();

	    	            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(temp.up()))
	    	            {
	    	                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH || block == Blocks.DIRT)
	    	                {
	    	                    this.setBlock(itemstack, player, worldIn, temp, Blocks.FARMLAND.getDefaultState());
	    	                }
	    	            }
	            	}
	            }
	            

	            return EnumActionResult.SUCCESS;
	        }
	    }
	    @Override
	    public boolean canHarvestBlock(IBlockState state, ItemStack stack) {
	        if (!(state.getMaterial() == Material.AIR) && !(state.getMaterial() == Material.BARRIER)) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	 
	    @Override
	    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
	        return repair.getItem() == repairItem ? true : super.getIsRepairable(toRepair, repair);
	    }
	 
	    @Override
	    public boolean hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase attacker) {
	        // Only take one damage like a sword instead of 2
	        itemStack.damageItem(1, attacker);
	        
	        attacker.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS,20,0,false,false));
	        return true;
	    }
	
	    public float getDestroySpeed(ItemStack stack, IBlockState state)
	    {
	       return this.efficiency;
	    }
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");
		
	}
	
	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {
		
        if (!worldIn.isRemote && (double)state.getBlockHardness(worldIn, pos) != 0.0D)
        {
            stack.damageItem(1, entityLiving);
        }
        entityLiving.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS,20,0,false,false));
      
        return true;
    }

}
