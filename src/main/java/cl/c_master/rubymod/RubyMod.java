package cl.c_master.rubymod;

import org.apache.logging.log4j.*;

import cl.c_master.rubymod.utils.EntityUtils;
import cl.c_master.rubymod.utils.ModBlocks;
import cl.c_master.rubymod.utils.ModEntityType;
import cl.c_master.rubymod.utils.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import software.bernie.geckolib3.GeckoLib;

public class RubyMod implements ModInitializer
{
    public static final Logger LOG = LogManager.getLogger();
    public static final String MODID = "rubymod";
    @Override
    public void onInitialize()
    {
        ModEntityType.init();
        ModBlocks.init();
        ModItems.init();
        GeckoLib.initialize();
        FabricDefaultAttributeRegistry.register(ModEntityType.RUBY_MONSTRUOSITY, EntityUtils.createRubyMonstruosityAttributes());
    }
    
}
