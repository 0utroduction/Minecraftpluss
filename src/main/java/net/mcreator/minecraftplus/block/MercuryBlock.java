
package net.mcreator.minecraftplus.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraftplus.procedures.MercuryMobplayerCollidesBlockProcedure;
import net.mcreator.minecraftplus.init.MinecraftplusModFluids;

public class MercuryBlock extends LiquidBlock {
	public MercuryBlock() {
		super(() -> MinecraftplusModFluids.MERCURY.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		MercuryMobplayerCollidesBlockProcedure.execute(entity);
	}
}
