package net.mcreator.minecraftplus.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftplus.network.MinecraftplusModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MelonVarIncreaseProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == Items.MELON_SLICE) {
			{
				double _setval = (entity.getCapability(MinecraftplusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MinecraftplusModVariables.PlayerVariables())).PalajeetPoisoningPercentage + 1;
				entity.getCapability(MinecraftplusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MelonConsumptionAmount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
