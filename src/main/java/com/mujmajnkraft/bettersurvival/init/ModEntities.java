package com.mujmajnkraft.bettersurvival.init;

import com.mujmajnkraft.bettersurvival.Bettersurvival;
import com.mujmajnkraft.bettersurvival.entities.EntityFlyingSpear;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void registerEntities()
	{
		int id = 0;
		
		EntityRegistry.registerModEntity(new ResourceLocation("mujmajnkraftsbettersurvival", "EntityFlyingSpear"), EntityFlyingSpear.class, "EntityFlyingSpear", id++, Bettersurvival.instance, 64, 20, true);
	}
	
}