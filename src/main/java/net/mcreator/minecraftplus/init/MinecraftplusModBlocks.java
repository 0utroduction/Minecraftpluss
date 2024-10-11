
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecraftplus.block.UraniumOreBlock;
import net.mcreator.minecraftplus.block.UraniumBlockBlock;
import net.mcreator.minecraftplus.block.MercuryOreBlock;
import net.mcreator.minecraftplus.block.MercuryBlockBlock;
import net.mcreator.minecraftplus.MinecraftplusMod;

public class MinecraftplusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftplusMod.MODID);
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> URANIUM_BLOCK = REGISTRY.register("uranium_block", () -> new UraniumBlockBlock());
	public static final RegistryObject<Block> MERCURY_ORE = REGISTRY.register("mercury_ore", () -> new MercuryOreBlock());
	public static final RegistryObject<Block> MERCURY_BLOCK = REGISTRY.register("mercury_block", () -> new MercuryBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
