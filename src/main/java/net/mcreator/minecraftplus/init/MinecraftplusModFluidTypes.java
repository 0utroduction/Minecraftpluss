
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.minecraftplus.fluid.types.MercuryFluidType;
import net.mcreator.minecraftplus.MinecraftplusMod;

public class MinecraftplusModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MinecraftplusMod.MODID);
	public static final RegistryObject<FluidType> MERCURY_TYPE = REGISTRY.register("mercury", () -> new MercuryFluidType());
}
