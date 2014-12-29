package com.Bloods.dimenPizza.init;

import com.Bloods.BloodTG.item.ItemBTG;

import com.Bloods.BloodTG.item.ItemComponents;
import com.Bloods.BloodTG.item.ItemBracer;
import com.Bloods.BloodTG.item.ItemObsLeather;
import com.Bloods.BloodTG.item.ItemShoulder;

import com.Bloods.BloodTG.item.bracer.ItemBracerEnder;
import com.Bloods.BloodTG.item.bracer.ItemBracerEther;
import com.Bloods.BloodTG.item.bracer.ItemBracerHealth;
import com.Bloods.BloodTG.item.bracer.ItemBracerIce;
import com.Bloods.BloodTG.item.bracer.ItemBracerLife;
import com.Bloods.BloodTG.item.bracer.ItemBracerExtra;

import cpw.mods.fml.common.registry.GameRegistry;
import com.Bloods.BloodTG.reference.Reference;

@GameRegistry.ObjectHolder(Reference.Mod_ID)

public class BDPItemsLoader
{
	//General Items
	public static final ItemBTG components = new ItemComponents();


	public static void init()
	{
		//General Items
		GameRegistry.registerItem(components, "components");
	}
}
