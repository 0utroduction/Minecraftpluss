
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.minecraftplus.world.inventory.MedallionMenuMenu;
import net.mcreator.minecraftplus.MinecraftplusMod;

public class MinecraftplusModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MinecraftplusMod.MODID);
	public static final RegistryObject<MenuType<MedallionMenuMenu>> MEDALLION_MENU = REGISTRY.register("medallion_menu", () -> IForgeMenuType.create(MedallionMenuMenu::new));
}
