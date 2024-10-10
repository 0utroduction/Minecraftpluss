
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftplus.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.minecraftplus.network.MedallionMenuKeybindMessage;
import net.mcreator.minecraftplus.MinecraftplusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MinecraftplusModKeyMappings {
	public static final KeyMapping MEDALLION_MENU_KEYBIND = new KeyMapping("key.minecraftplus.medallion_menu_keybind", GLFW.GLFW_KEY_V, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MinecraftplusMod.PACKET_HANDLER.sendToServer(new MedallionMenuKeybindMessage(0, 0));
				MedallionMenuKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(MEDALLION_MENU_KEYBIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				MEDALLION_MENU_KEYBIND.consumeClick();
			}
		}
	}
}
