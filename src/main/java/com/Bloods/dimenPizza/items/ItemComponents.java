package com.Bloods.dimenPizza.items;

import net.minecraft.util.IIcon;

public class ItemComponents extends ItemBDP
{
	public static String[] subComponents = {"itemTomato", "itemSalt", "itemDough", "itemBeef", "itemHam", "itemChicken", "itemSauce", "itemCheese"};
	IIcon[] icons = new IIcon[subComponents.length];
	
	public ItemComponents()
	{
		super();
		this.setMaxStackSize(64);
	}
}
