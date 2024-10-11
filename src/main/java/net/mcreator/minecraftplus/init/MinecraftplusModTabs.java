
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecraftplus.MinecraftplusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftplusModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftplusMod.MODID);
	public static final RegistryObject<CreativeModeTab> MEDALLIONS = REGISTRY.register("medallions",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.minecraftplus.medallions")).icon(() -> new ItemStack(MinecraftplusModItems.DIAMOND_MEDALLION.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MinecraftplusModItems.DIAMOND_MEDALLION.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(MinecraftplusModBlocks.URANIUM_ORE.get().asItem());
			tabData.accept(MinecraftplusModBlocks.URANIUM_BLOCK.get().asItem());
			tabData.accept(MinecraftplusModBlocks.MERCURY_ORE.get().asItem());
			tabData.accept(MinecraftplusModBlocks.MERCURY_BLOCK.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(MinecraftplusModItems.URANIUM.get());
			tabData.accept(MinecraftplusModItems.RUBY.get());
			tabData.accept(MinecraftplusModItems.MERCURY_INGOT.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

			tabData.accept(MinecraftplusModItems.APPLE_SLICE.get());
			tabData.accept(MinecraftplusModItems.PEARSLICES.get());
			tabData.accept(MinecraftplusModItems.URANIUM.get());
			tabData.accept(MinecraftplusModItems.PALAJEET.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(MinecraftplusModItems.MERCURY_BUCKET.get());

		}
	}
}
