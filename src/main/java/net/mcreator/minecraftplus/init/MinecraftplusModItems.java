
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecraftplus.item.UraniumItem;
import net.mcreator.minecraftplus.item.RubyItem;
import net.mcreator.minecraftplus.item.PearslicesItem;
import net.mcreator.minecraftplus.item.PalajeetItem;
import net.mcreator.minecraftplus.item.MercuryIngotItem;
import net.mcreator.minecraftplus.item.DiamondMedallionItem;
import net.mcreator.minecraftplus.item.AppleSliceItem;
import net.mcreator.minecraftplus.MinecraftplusMod;

public class MinecraftplusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftplusMod.MODID);
	public static final RegistryObject<Item> APPLE_SLICE = REGISTRY.register("apple_slice", () -> new AppleSliceItem());
	public static final RegistryObject<Item> PEARSLICES = REGISTRY.register("pearslices", () -> new PearslicesItem());
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(MinecraftplusModBlocks.URANIUM_ORE);
	public static final RegistryObject<Item> URANIUM_BLOCK = block(MinecraftplusModBlocks.URANIUM_BLOCK);
	public static final RegistryObject<Item> DIAMOND_MEDALLION = REGISTRY.register("diamond_medallion", () -> new DiamondMedallionItem());
	public static final RegistryObject<Item> PALAJEET = REGISTRY.register("palajeet", () -> new PalajeetItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> MERCURY_INGOT = REGISTRY.register("mercury_ingot", () -> new MercuryIngotItem());
	public static final RegistryObject<Item> MERCURY_ORE = block(MinecraftplusModBlocks.MERCURY_ORE);
	public static final RegistryObject<Item> MERCURY_BLOCK = block(MinecraftplusModBlocks.MERCURY_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
