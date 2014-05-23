package com.cyborgJenn.miniCreeps;


import javax.swing.JButton;
import javax.swing.JFrame;

import com.cyborgJenn.miniCreeps.proxy.CommonProxy;
import com.cyborgJenn.miniCreeps.utils.Config;
import com.cyborgJenn.miniCreeps.utils.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;



@Mod(modid = Reference.MODID, name = Reference.NAME,version = Reference.VERSION)
public class MiniCreeps {
	
	@Instance(Reference.NAME)
	public static MiniCreeps  instance;

	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		// Loads the Configuration File
		Config.init(event);
        
		System.out.println("[MiniCreeps] " + "Pre Init Complete..........");

	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		int entityID;
		entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityMiniCreeper.class, "MiniCreeper", entityID, 0x5A5C5B, 0x1F6138);
        EntityRegistry.registerModEntity(EntityMiniCreeper.class, "MiniCreeper", entityID, MiniCreeps.instance, 64, 20, true);
        EntityRegistry.addSpawn(EntityMiniCreeper.class, 1, 1, 2, EnumCreatureType.monster);
        
		proxy.registerRenderers();
		System.out.println("[MiniCreeps] " + "Init Complete.............");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("[MiniCreeps] " + "Post Init Complete.............");
	}
}
