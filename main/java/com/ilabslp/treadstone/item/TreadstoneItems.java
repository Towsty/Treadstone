package com.ilabslp.treadstone.item;

import com.ilabslp.treadstone.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class TreadstoneItems {

	public static Item itemBottle;
	public static Item itemChocolate;
	public static Item itemTootsie;
	
	public static final void init(){
		
		//items
		itemBottle = new Item().setUnlocalizedName("itemBottle").setCreativeTab(CreativeTabs.tabMisc).setTextureName(References.MODID + ":itemBottle");
		
		//food
		itemChocolate = new TreadstoneFood("itemChocolate", 2, 0.2f, false, new PotionEffect(Potion.moveSpeed.id, 1200, 1), new PotionEffect(Potion.jump.id, 600, 0), new PotionEffect(Potion.regeneration.id, 200, 1)).setAlwaysEdible();
		itemTootsie = new TreadstoneFood("itemTootsie", 1, 0.2f, false, new PotionEffect(Potion.digSpeed.id, 300, 5));
		
		//registry
		GameRegistry.registerItem(itemBottle, "itemBottle");
		GameRegistry.registerItem(itemChocolate, "itemChocolate");
		GameRegistry.registerItem(itemTootsie, "itemTootsie");
		
	}
	
}
