package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class RubyPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.giveExperiencePoints((int) ((entity instanceof Player _plr ? _plr.experienceLevel : 0) + 1 + (entity instanceof Player _plr ? _plr.experienceLevel : 0) / 5));
	}
}
