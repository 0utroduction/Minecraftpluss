
package net.mcreator.minecraftplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.minecraftplus.entity.BubEntity;
import net.mcreator.minecraftplus.client.model.Modelagent;

public class BubRenderer extends MobRenderer<BubEntity, Modelagent<BubEntity>> {
	public BubRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelagent(context.bakeLayer(Modelagent.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BubEntity entity) {
		return new ResourceLocation("minecraftplus:textures/entities/bub.png");
	}
}
