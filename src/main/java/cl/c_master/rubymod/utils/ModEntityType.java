package cl.c_master.rubymod.utils;

import cl.c_master.rubymod.entity.RubyMonstruosityEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class ModEntityType
{
    public static EntityType<RubyMonstruosityEntity> RUBY_MONSTRUOSITY;
    public static void init()
    {
        RUBY_MONSTRUOSITY = RegistryHelper.registerEntityType("ruby_monstruosity", EntityType.Builder.create(RubyMonstruosityEntity::new, SpawnGroup.MONSTER).makeFireImmune().setDimensions(1.5F, 3.3F).maxTrackingRange(8));
    }
}
