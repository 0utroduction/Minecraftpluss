package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class PoopProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().mayBuild = false;
			_player.onUpdateAbilities();
		}
	}
}
