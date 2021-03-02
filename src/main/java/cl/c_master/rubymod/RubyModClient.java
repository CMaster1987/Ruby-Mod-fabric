package cl.c_master.rubymod;

import cl.c_master.rubymod.client.render.entity.RubyMonstruosityEntityRenderer;
import cl.c_master.rubymod.utils.ModEntityType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

public class RubyModClient implements ClientModInitializer
{

	@Override
	public void onInitializeClient()
    {
		EntityRendererRegistry.INSTANCE.register(ModEntityType.RUBY_MONSTRUOSITY, (entityRenderDispatcher, context) -> new RubyMonstruosityEntityRenderer(entityRenderDispatcher));
	}
    
}
