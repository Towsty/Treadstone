package com.ilabslp.treadstone;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import item.TreadstoneItems;

public class CommonProxy {

	    public void preInit(FMLPreInitializationEvent e) {
	    	TreadstoneItems.init();
	    }

	    public void init(FMLInitializationEvent e) {

	    }

	    public void postInit(FMLPostInitializationEvent e) {

	    }	
}
