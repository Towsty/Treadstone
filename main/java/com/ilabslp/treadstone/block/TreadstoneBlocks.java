package com.ilabslp.treadstone.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TreadstoneBlocks {
	public static Block blockTable;
	
	public static final void init(){
		GameRegistry.registerBlock(blockTable = new BasicBlock("blockTable", Material.wood), "blockTable");
	}
}
