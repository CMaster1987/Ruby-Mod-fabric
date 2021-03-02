// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

package cl.c_master.rubymod.client.model.entity;

import cl.c_master.rubymod.RubyMod;
import cl.c_master.rubymod.entity.RubyMonstruosityEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RubyMonstruosityEntityModel extends AnimatedGeoModel<RubyMonstruosityEntity> {

	@Override
	public Identifier getAnimationFileLocation(RubyMonstruosityEntity animatable)
	{
		return new Identifier(RubyMod.MODID, "animations/ruby_monstruosity.animation.json");
	}

	@Override
	public Identifier getModelLocation(RubyMonstruosityEntity object)
	{
		return new Identifier(RubyMod.MODID, "geo/ruby_monstruosity.geo.json");
	}

	@Override
	public Identifier getTextureLocation(RubyMonstruosityEntity object)
	{
		RenderLayer.getEyes(new Identifier(RubyMod.MODID, "textures/entity/ruby_monstruosity_emissive.png"));
		return new Identifier(RubyMod.MODID, "textures/entity/ruby_monstruosity.png");
	}

	
}