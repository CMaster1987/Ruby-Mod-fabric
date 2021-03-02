package cl.c_master.rubymod.utils;

import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;

public class EntityUtils
{
    public static DefaultAttributeContainer.Builder createRubyMonstruosityAttributes()
    {
        return HostileEntity.createMobAttributes()
        .add(EntityAttributes.GENERIC_MAX_HEALTH, 800.0D)
        .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3D)
        .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.78D)
        .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 3.0D)
        .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 2.472D)
        .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 14.0D);
    }
}
