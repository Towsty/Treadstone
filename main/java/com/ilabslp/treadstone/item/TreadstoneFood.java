package com.ilabslp.treadstone.item;

import com.ilabslp.treadstone.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TreadstoneFood extends ItemFood{

	private PotionEffect[] effects;
	
	public TreadstoneFood(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(References.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.effects = effects;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		
		for (int i = 0; i <effects.length; i ++){
			if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
				player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
		}
		
	}
	
	

}
