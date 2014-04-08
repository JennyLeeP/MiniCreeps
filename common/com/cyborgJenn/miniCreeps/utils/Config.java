package com.cyborgJenn.miniCreeps.utils;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {
	public static Boolean enableDebug;
	
	public static void init(FMLPreInitializationEvent event) {

        File configFile = new File(event.getModConfigurationDirectory(), Reference.NAME + ".cfg");

        Configuration config = new Configuration(configFile);

        try{
            config.load();

            configDebug(config);

        }catch(Exception e){
            System.out.println(e);
        }finally{
            if (config.hasChanged())
                config.save();
        }
    }
	private static void configDebug(Configuration config){
        String debug = "Debug";
        enableDebug = config.get(debug, "enableDebug", false).getBoolean(false);
      
    }
}
