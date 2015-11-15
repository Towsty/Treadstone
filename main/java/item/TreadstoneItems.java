package item;

import cpw.mods.fml.common.registry.GameRegistry;
import lib.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TreadstoneItems {

	public static Item itemBottle;
	public static final void init(){
		
		itemBottle = new Item().setUnlocalizedName("itemBottle").setCreativeTab(CreativeTabs.tabMisc).setTextureName(References.MODID + ":itemBottle");
		GameRegistry.registerItem(itemBottle, "itemBottle");
	}
	
}
