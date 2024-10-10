package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecraftplus.network.MinecraftplusModVariables;

public class PalajeetPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
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
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("minecraftplus:palajeet_poisoning")))),
						Mth.nextInt(RandomSource.create(), 1, 9));
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("minecraftplus:palajeet_poisoning")))),
						Mth.nextInt(RandomSource.create(), 1, 8));
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("minecraftplus:palajeet_poisoning")))),
						Mth.nextInt(RandomSource.create(), 1, 7));
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("minecraftplus:palajeet_poisoning")))),
						Mth.nextInt(RandomSource.create(), 1, 6));
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("minecraftplus:palajeet_poisoning")))),
						Mth.nextInt(RandomSource.create(), 1, 5));
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
