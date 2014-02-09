package cyborgJenn.miniCreeps;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cyborgJenn.miniCreeps.utils.Config;
import cyborgJenn.miniCreeps.utils.Reference;



@Mod(modid = Reference.MODID, name = Reference.NAME,version = Reference.VERSION)
public class MiniCreeps {
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		// Loads the Configuration File
		Config.init(event);
		System.out.println("[MiniCreeps] " + "Pre Init Complete..........");

	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		System.out.println("[MiniCreeps] " + "Init Complete.............");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("[MiniCreeps] " + "Post Init Complete.............");
	}
	
}
