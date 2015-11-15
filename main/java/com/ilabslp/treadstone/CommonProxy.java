package com.ilabslp.treadstone;

import com.ilabslp.treadstone.block.TreadstoneBlocks;
import com.ilabslp.treadstone.item.TreadstoneItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	    public void preInit(FMLPreInitializationEvent e) {
	    	TreadstoneItems.init();
	    	TreadstoneBlocks.init();
	    }

	    public void init(FMLInitializationEvent e) {

	    }

	    public void postInit(FMLPostInitializationEvent e) {

	    }	
}
