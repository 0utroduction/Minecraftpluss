
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.minecraftplus.item.AppleSliceItem;
import net.mcreator.minecraftplus.MinecraftplusMod;

public class MinecraftplusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftplusMod.MODID);
	public static final RegistryObject<Item> APPLE_SLICE = REGISTRY.register("apple_slice", () -> new AppleSliceItem());
	// Start of user code block custom items
	// End of user code block custom items
}
