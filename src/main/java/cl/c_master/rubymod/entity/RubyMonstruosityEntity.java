package cl.c_master.rubymod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Packet;
import net.minecraft.world.World;

public class RubyMonstruosityEntity extends Entity {

    public RubyMonstruosityEntity(EntityType<?> type, World world) {
        super(type, world);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Packet<?> createSpawnPacket() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected void initDataTracker() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void readCustomDataFromTag(CompoundTag tag) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void writeCustomDataToTag(CompoundTag tag) {
        // TODO Auto-generated method stub

    }
    
}
