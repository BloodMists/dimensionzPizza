package com.Bloods.dimenPizza.creativetab;

import com.Bloods.dimenPizza.init.BDPItemsLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativetabIBTG
{
	public static final CreativeTabs Dimenz_Pizza_Items = new CreativeTabs("tab.bloodbdp:IBDP") 
	{
		@Override
		public Item getTabIconItem()
		{
			return BDPItemsLoader.components;
		}
		
	};
}
