package com.ilabslp.treadstone;

import com.ilabslp.treadstone.item.TreadstoneItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TreadstoneCrafting {

	public static final void init(){
		GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 3), new ItemStack(TreadstoneItems.itemBottle), 1.0f);	
	}
	
}
