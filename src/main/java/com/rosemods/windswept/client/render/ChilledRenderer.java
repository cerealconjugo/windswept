package com.rosemods.windswept.client.render;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.vertex.PoseStack;
import com.rosemods.windswept.core.Windswept;

import net.minecraft.client.renderer.entity.ZombieRenderer;

@OnlyIn(Dist.CLIENT)
public class ChilledRenderer extends ZombieRenderer {
	private static final ResourceLocation CHILLED_LOCATION = Windswept.REGISTRY_HELPER.prefix("textures/entity/chilled.png");

	public ChilledRenderer(Context context) {
		super(context);
	}
	
	@Override
	protected void scale(Zombie chilled, PoseStack pose, float p_114909_) {
		pose.scale(.975f, .975f, .975f);
	}
	
	@Override
	public ResourceLocation getTextureLocation(Zombie chilled) {
		return CHILLED_LOCATION;
	}
	
	@Override
	protected boolean isShaking(Zombie chilled) {
		return true;
	}

}
