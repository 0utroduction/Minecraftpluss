
package net.mcreator.minecraftplus.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.minecraftplus.init.MinecraftplusModItems;
import net.mcreator.minecraftplus.init.MinecraftplusModFluids;
import net.mcreator.minecraftplus.init.MinecraftplusModFluidTypes;
import net.mcreator.minecraftplus.init.MinecraftplusModBlocks;

public abstract class MercuryFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MinecraftplusModFluidTypes.MERCURY_TYPE.get(), () -> MinecraftplusModFluids.MERCURY.get(), () -> MinecraftplusModFluids.FLOWING_MERCURY.get())
			.explosionResistance(100f).bucket(() -> MinecraftplusModItems.MERCURY_BUCKET.get()).block(() -> (LiquidBlock) MinecraftplusModBlocks.MERCURY.get());

	private MercuryFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.LARGE_SMOKE;
	}

	public static class Source extends MercuryFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MercuryFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
