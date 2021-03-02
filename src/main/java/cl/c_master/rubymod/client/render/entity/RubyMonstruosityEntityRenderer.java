package cl.c_master.rubymod.client.render.entity;

import cl.c_master.rubymod.client.model.entity.RubyMonstruosityEntityModel;
import cl.c_master.rubymod.entity.RubyMonstruosityEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class RubyMonstruosityEntityRenderer extends GeoEntityRenderer<RubyMonstruosityEntity> {

    public RubyMonstruosityEntityRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new RubyMonstruosityEntityModel());
    }
    
}
