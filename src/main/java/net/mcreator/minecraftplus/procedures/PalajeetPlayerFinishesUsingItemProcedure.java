package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.minecraftplus.network.MinecraftplusModVariables;

public class PalajeetPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MinecraftplusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MinecraftplusModVariables.PlayerVariables())).PalajeetPoisoningPercentage == 100) {
			{
				double _setval = 0;
				entity.getCapability(MinecraftplusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PalajeetPoisoningPercentage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (Mth.nextInt(RandomSource.create(), 1, 100) <= (entity.getCapability(MinecraftplusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MinecraftplusModVariables.PlayerVariables())).PalajeetPoisoningPercentage) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 240, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 240, 100));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 240, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 240, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 240, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 240, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 120, 1));
			} else {
				{
					double _setval = (entity.getCapability(MinecraftplusModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MinecraftplusModVariables.PlayerVariables())).PalajeetPoisoningPercentage + 10;
					entity.getCapability(MinecraftplusModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PalajeetPoisoningPercentage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
