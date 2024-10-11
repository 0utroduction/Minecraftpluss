package net.mcreator.minecraftplus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftplus.init.MinecraftplusModBlocks;

public class MercuryOreBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), MinecraftplusModBlocks.MERCURY.get().defaultBlockState(), 3);
	}
}
