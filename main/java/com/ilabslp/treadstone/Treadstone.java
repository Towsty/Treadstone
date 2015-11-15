package com.ilabslp.treadstone;

import com.ilabslp.treadstone.lib.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)
public class Treadstone {
    
	public static Treadstone instance = new Treadstone();
	
	@SidedProxy(clientSide="com.ilabslp.treadstone.ClientProxy", serverSide="com.ilabslp.treadstone.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
    public static void preInit(FMLPreInitializationEvent e)
    {
		proxy.preInit(e);
    }
 
    @EventHandler
    public static void init(FMLInitializationEvent e)
    {
    	proxy.init(e);
    }
 
    @EventHandler
    public static void postInit(FMLPostInitializationEvent e)
    {
    	proxy.postInit(e);
    } 
}
