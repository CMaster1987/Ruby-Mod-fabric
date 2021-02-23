package cl.c_master.rubymod;

import org.apache.logging.log4j.*;

import cl.c_master.rubymod.utils.ModBlocks;
import cl.c_master.rubymod.utils.ModItems;
import net.fabricmc.api.ModInitializer;

public class RubyMod implements ModInitializer
{
    public static final Logger LOG = LogManager.getLogger();
    public static final String MODID = "rubymod";
    @Override
    public void onInitialize()
    {
        ModBlocks.init();
        ModItems.init();
    }
    
}
