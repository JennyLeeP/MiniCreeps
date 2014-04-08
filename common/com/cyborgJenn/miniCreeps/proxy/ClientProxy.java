package com.cyborgJenn.miniCreeps.proxy;

import com.cyborgJenn.miniCreeps.EntityMiniCreeper;
import com.cyborgJenn.miniCreeps.RenderMiniCreeper;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	
	public void registerRenderers() {

		RenderingRegistry.registerEntityRenderingHandler(EntityMiniCreeper.class, new RenderMiniCreeper());
		
	}
}
