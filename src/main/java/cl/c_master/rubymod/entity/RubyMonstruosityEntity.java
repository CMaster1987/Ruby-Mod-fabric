package cl.c_master.rubymod.entity;

import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.control.JumpControl;
import net.minecraft.entity.ai.goal.AttackGoal;
import net.minecraft.entity.ai.goal.FollowTargetGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class RubyMonstruosityEntity extends HostileEntity implements IAnimatable
{
    private AnimationFactory factory = new AnimationFactory(this);

    public RubyMonstruosityEntity(EntityType<? extends HostileEntity> type, World world)
    {
        super(type, world);
        this.stepHeight = 1.2F;
        this.experiencePoints = 80;
        this.jumpControl = new JumpControl(this);
    }
    public <E extends IAnimatable> PlayState predicate(AnimationEvent<RubyMonstruosityEntity> event)
    {
        if(event.isMoving() && !this.isAttacking())
        {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.ruby_monstruosity.walk"));
            return PlayState.CONTINUE;
        }
        else if(this.isAttacking())
        {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.ruby_monstruosity.attack"));
        }
        else
        {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.ruby_monstruosity.idle"));
        }
        return PlayState.CONTINUE;

    }

    @Override
    public void registerControllers(AnimationData data)
    {
        data.addAnimationController(new AnimationController(this, "controller", 20, this::predicate));
    }

    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }
    protected void initGoals()
    {
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(2, new AttackGoal(this));
        this.goalSelector.add(3, new MeleeAttackGoal(this, 0.2D, true));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(6, new LookAroundGoal(this));
        this.targetSelector.add(1, new FollowTargetGoal<PlayerEntity>(this, PlayerEntity.class, true, true));
        super.initGoals();
    }
    public EntityGroup getGroup()
    {
        return EntityGroup.DEFAULT;
    }

    /*public class AttackGoal extends MeleeAttackGoal
    {
        private int attackType;
        private float specialAttackCharge;
        public AttackGoal(RubyMonstruosityEntity mob)
        {
            super(mob, 0.3D, true);
            this.isSpecialAttackReady(mob);
        }
        public int getAttackType()
        {
            return this.attackType;
        }
        public float getSpecialAttackCharge()
        {
            return this.specialAttackCharge;
        }
        public boolean isSpecialAttackReady(RubyMonstruosityEntity entity)
        {
            if(entity.isAttacking() && getSpecialAttackCharge() < 200.0F)
            {
                this.specialAttackCharge += 0.3F;
            }
            if(getSpecialAttackCharge() >= 200.0F)
            {
                this.attackType = 1;
                return true;
            }
            else
            {
                return false;
            }
        }
        
    }*/
    
}
