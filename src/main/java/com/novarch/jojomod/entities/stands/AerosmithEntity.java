package com.novarch.jojomod.entities.stands;

import com.novarch.jojomod.JojoBizarreSurvival;
import com.novarch.jojomod.capabilities.stand.Stand;
import com.novarch.jojomod.entities.stands.attacks.AerosmithBulletEntity;
import com.novarch.jojomod.init.EntityInit;
import com.novarch.jojomod.init.SoundInit;
import com.novarch.jojomod.network.message.client.CSyncAerosmithPacket;
import com.novarch.jojomod.util.Util;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("ConstantConditions")
@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class AerosmithEntity extends AbstractStandEntity {
    public float yaw, pitch;

    public AerosmithEntity(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
        spawnSound = SoundInit.SPAWN_AEROSMITH.get();
        standID = Util.StandID.AEROSMITH;
    }

    public AerosmithEntity(World worldIn) {
        super(EntityInit.AEROSMITH.get(), worldIn);
        spawnSound = SoundInit.SPAWN_AEROSMITH.get();
        standID = Util.StandID.AEROSMITH;
    }

    @Override
    public void playSpawnSound() {
<<<<<<< HEAD
        world.playSound(null, getMaster().getPosition(), getSpawnSound(), getSoundCategory(), 3.0f, 1.0f);
=======
        world.playSound(null, getMaster().getPosition(), getSpawnSound(), getSoundCategory(), 3, 1);
>>>>>>> e790b14021843e8d6ad83265f275bfb141ebb825
    }

    public void shootBomb() {
        Stand.getLazyOptional(getMaster()).ifPresent(props -> {
            if (props.getCooldown() <= 0) {
                TNTEntity tnt = new TNTEntity(world, getPosX(), getPosY(), getPosZ(), getMaster());
                tnt.setFuse(20);
                tnt.setVelocity(getLookVec().getX(), getLookVec().getY(), getLookVec().getZ());
                if (!world.isRemote)
                    world.addEntity(tnt);
                props.setCooldown(200);
            }
        });
    }

    @Override
    public void attack(boolean special) {
        if (getMaster() == null) return;
        attackTick++;
        if (attackTick == 1)
            if (special) {
                world.playSound(null, getPosition(), SoundInit.VOLARUSH.get(), SoundCategory.NEUTRAL, 4.05f, 1);
                attackRush = true;
            } else {
                world.playSound(null, getPosition(), SoundInit.PUNCH_MISS.get(), SoundCategory.NEUTRAL, 1, 0.6f / (rand.nextFloat() * 0.3f + 1) * 2);
                AerosmithBulletEntity aerosmithBulletEntity = new AerosmithBulletEntity(world, this, getMaster());
                aerosmithBulletEntity.shoot(getMaster(), rotationPitch, rotationYaw, 4, 0.4f);
                world.addEntity(aerosmithBulletEntity);
                attackTick = 0;
            }
    }

    @Override
    public void tick() {
        super.tick();
        setMotion(getMotion().getX(), 0, getMotion().getZ());

        if (getMaster() != null) {
            PlayerEntity player = getMaster();
            Stand.getLazyOptional(player).ifPresent(props -> {
                if (ability != props.getAbility()) {
                    if (!ability)
                        JojoBizarreSurvival.INSTANCE.sendToServer(new CSyncAerosmithPacket(CSyncAerosmithPacket.Action.RENDER));
                    ability = props.getAbility();
                }
                if (ability)
                    if (props.getCooldown() > 0)
                        props.subtractCooldown(1);
            });

            setRotation(yaw, pitch);
            if (getMotion().getX() == 0 && getMotion().getY() == 0 && getMotion().getZ() == 0)
                setRotationYawHead(yaw);

<<<<<<< HEAD
            if ((player.swingProgressInt == 0 && !ability) || (swingProgressInt == 0 && ability))
=======
//            if ((!player.isSprinting() && !ability) || (!isSprinting() && ability)) {
//                if ((attackSwing(player) && !ability) || (swingProgressInt == 1 && ability)) {
//                    attackTick++;
//                    if (attackTick == 1) {
//                        AerosmithBulletEntity aerosmithBullet = new AerosmithBulletEntity(world, this, player);
//                        aerosmithBullet.shoot(player, rotationPitch, rotationYaw, 4.0f, 0.4f);
//                        world.addEntity(aerosmithBullet);
//                        JojoBizarreSurvival.INSTANCE.sendToServer(new CSyncAerosmithPacket(5, 1));
//                    }
//                }
//            } else if ((player.isSprinting() && !ability) || (isSprinting() && ability)) {
//                if ((attackSwing(player) && !ability) || (swingProgressInt == 1 && ability))
//                    if (player.getFoodStats().getFoodLevel() > 6) {
//                        attackTick++;
//                        if (attackTick == 1) {
//                            world.playSound(null, new BlockPos(getPosX(), getPosY(), getPosZ()), SoundInit.VOLARUSH.get(), getSoundCategory(), 4.05f, 1.0f);
//                            if (!world.isRemote)
//                                attackRush = true;
//                        }
//                    }
//            }
            if (player.swingProgressInt == 0 && !ability && !attackRush)
>>>>>>> e790b14021843e8d6ad83265f275bfb141ebb825
                attackTick = 0;
            if (attackRush) {
                if (!ability)
                    player.setSprinting(false);
                else
                    setSprinting(false);
                attackTicker++;
                if (attackTicker >= 10)
                    if (!world.isRemote) {
                        player.setSprinting(false);
                        AerosmithBulletEntity aerosmithBullet1 = new AerosmithBulletEntity(world, this, player);
                        aerosmithBullet1.setRandomPositions();
                        aerosmithBullet1.shoot(player, rotationPitch, rotationYaw, 4, 0.3f);
                        world.addEntity(aerosmithBullet1);
                        AerosmithBulletEntity aerosmithBullet2 = new AerosmithBulletEntity(world, this, player);
                        aerosmithBullet2.setRandomPositions();
                        aerosmithBullet2.shoot(player, rotationPitch, rotationYaw, 4, 0.3f);
                        world.addEntity(aerosmithBullet2);
                    }
                if (attackTicker >= 110) {
                    attackRush = false;
                    attackTicker = 0;
<<<<<<< HEAD
=======
                    attackTick = 0;
>>>>>>> e790b14021843e8d6ad83265f275bfb141ebb825
                }
            }
        }
    }

    @Override
    public void onAddedToWorld() {
        super.onAddedToWorld();
        if (getMaster() != null)
            Stand.getLazyOptional(getMaster()).ifPresent(props -> {
                if (props.getAbility())
                    JojoBizarreSurvival.INSTANCE.sendToServer(new CSyncAerosmithPacket(CSyncAerosmithPacket.Action.RENDER));
            });
    }
}
