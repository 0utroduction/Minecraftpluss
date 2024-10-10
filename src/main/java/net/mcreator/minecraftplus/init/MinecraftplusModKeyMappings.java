
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

import net.mcreator.minecraftplus.network.MedallionguiopenMessage;
import net.mcreator.minecraftplus.MinecraftplusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MinecraftplusModKeyMappings {
	public static final KeyMapping MEDALLIONGUIOPEN = new KeyMapping("key.minecraftplus.medallionguiopen", GLFW.GLFW_KEY_E, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MinecraftplusMod.PACKET_HANDLER.sendToServer(new MedallionguiopenMessage(0, 0));
				MedallionguiopenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(MEDALLIONGUIOPEN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				MEDALLIONGUIOPEN.consumeClick();
			}
		}
	}
}
