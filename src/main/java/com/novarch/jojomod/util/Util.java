package com.novarch.jojomod.util;

import com.novarch.jojomod.entities.stands.*;
import com.novarch.jojomod.entities.stands.attacks.AbstractStandAttackEntity;
import com.novarch.jojomod.init.KeyInit;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.horse.SkeletonHorseEntity;
import net.minecraft.entity.passive.horse.ZombieHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.function.Predicate;

@SuppressWarnings("unused")
public class Util {
    public static int getHighestBlock(World world, BlockPos pos) {
        for (int height = world.getActualHeight(); height > 0; height--) {
            if (world.getBlockState(new BlockPos(pos.getX(), height, pos.getZ())).getMaterial() != Material.AIR) {
                return height;
            }
        }
        return -1;
    }

    public static BlockPos getNearestBlockEnd(World world, BlockPos pos) {
        for (int height = world.getActualHeight(); height > 0; height--) {
            if (pos.getX() > 0) {
                for (int x = pos.getX(); x > 0; x--) {
                    if (world.getBlockState(new BlockPos(x, height, pos.getZ())).getMaterial() != Material.AIR) {
                        return new BlockPos(x, height, pos.getZ());
                    }
                }
            } else if (pos.getX() < 0) {
                for (int x = pos.getX(); x < 0; x++) {
                    if (world.getBlockState(new BlockPos(x, height, pos.getZ())).getMaterial() != Material.AIR) {
                        return new BlockPos(x, height, pos.getZ());
                    }
                }
            }
        }
        return new BlockPos(0, 65, 0);
    }

    public static void sendStringMessage(PlayerEntity player, String message) {
        player.sendMessage(new StringTextComponent(message));
    }

    /**
     * Used to suppress warnings saying that <code>static final</code> fields are <code>null</code>.
     * Based on diesieben07's solution <a href="http://www.minecraftforge.net/forum/topic/60980-solved-disable-%E2%80%9Cconstant-conditions-exceptions%E2%80%9D-inspection-for-field-in-intellij-idea/?do=findCommentcomment=285024">here</a>.
     *
     * @return null
     */
    @Nonnull
    @SuppressWarnings("ConstantConditions")
    public static <T> T Null() {
        return null;
    }

    public static AbstractStandEntity getStand(int standID, World world) {
        switch (standID) {
            default:
                return Null();
            case StandID.KING_CRIMSON:
                return new KingCrimsonEntity(world);
            case StandID.D4C:
                return new D4CEntity(world);
            case StandID.GOLD_EXPERIENCE:
                return new GoldExperienceEntity(world);
            case StandID.MADE_IN_HEAVEN:
                return new MadeInHeavenEntity(world);
            case StandID.GER:
                return new GoldExperienceRequiemEntity(world);
            case StandID.AEROSMITH:
                return new AerosmithEntity(world);
            case StandID.WEATHER_REPORT:
                return new WeatherReportEntity(world);
            case StandID.KILLER_QUEEN:
                return new KillerQueenEntity(world);
            case StandID.CRAZY_DIAMOND:
                return new CrazyDiamondEntity(world);
            case StandID.PURPLE_HAZE:
                return new PurpleHazeEntity(world);
            case StandID.WHITESNAKE:
                return new WhitesnakeEntity(world);
            case StandID.CMOON:
                return new CMoonEntity(world);
            case StandID.THE_WORLD:
                return new TheWorldEntity(world);
            case StandID.STAR_PLATINUM:
                return new StarPlatinumEntity(world);
            case StandID.SILVER_CHARIOT:
                return new SilverChariotEntity(world);
            case StandID.MAGICIANS_RED:
                return new MagiciansRedEntity(world);
            case StandID.THE_HAND:
                return new TheHandEntity(world);
        }
    }

    public static class Predicates {
        public static final Predicate<Entity> NOT_STAND = entity -> !(entity instanceof AbstractStandEntity);
        public static final Predicate<Entity> IS_STAND = entity -> entity instanceof AbstractStandEntity;

        public static final Predicate<Entity> STAND_PUNCH_TARGET =
                EntityPredicates.NOT_SPECTATING
                        .and(EntityPredicates.IS_ALIVE)
                        .and(Entity::canBeCollidedWith);

        public static final Predicate<Entity> BREATHS =
                ((Predicate<Entity>) entity -> !(entity instanceof ZombieEntity))
                        .and(((Predicate<Entity>) entity -> !(entity instanceof HuskEntity))
                                .and(((Predicate<Entity>) entity -> !(entity instanceof DrownedEntity))
                                        .and(((Predicate<Entity>) entity -> !(entity instanceof ZombieHorseEntity))
                                                .and(((Predicate<Entity>) entity -> !(entity instanceof SkeletonEntity))
                                                        .and(((Predicate<Entity>) entity -> !(entity instanceof WitherSkeletonEntity))
                                                                .and(((Predicate<Entity>) entity -> !(entity instanceof SkeletonHorseEntity))
                                                                        .and(((Predicate<Entity>) entity -> !(entity instanceof GiantEntity))
                                                                                .and(((Predicate<Entity>) entity -> !(entity instanceof ZombieVillagerEntity))
                                                                                        .and(((Predicate<Entity>) entity -> !(entity instanceof StrayEntity))
                                                                                                .and(entity -> !(entity instanceof ZombiePigmanEntity))
                                                                                                .and(entity -> !(entity instanceof PhantomEntity))
                                                                                                .and(entity -> !(entity instanceof AbstractStandAttackEntity))
                                                                                                .and(entity -> !(entity instanceof AbstractStandEntity))
                                                                                                .and(entity -> !(entity instanceof ItemEntity)))))))))));
    }

    public static class StandID {
        public static final int KING_CRIMSON = 1;

        public static final int D4C = 2;

        public static final int GOLD_EXPERIENCE = 3;

        public static final int MADE_IN_HEAVEN = 4;

        public static final int GER = 5;

        public static final int AEROSMITH = 6;

        public static final int WEATHER_REPORT = 7;

        public static final int KILLER_QUEEN = 8;

        public static final int CRAZY_DIAMOND = 9;

        public static final int PURPLE_HAZE = 10;

        public static final int THE_EMPEROR = 11;

        public static final int WHITESNAKE = 12;

        public static final int CMOON = 13;

        public static final int THE_WORLD = 14;

        public static final int STAR_PLATINUM = 15;

        public static final int SILVER_CHARIOT = 16;

        public static final int MAGICIANS_RED = 17;

        public static final int THE_HAND = 18;

        /**
         * An array of Stand's that can be obtained through the {@link com.novarch.jojomod.item.StandArrowItem}.
         */
        public static final int[] STANDS = {
                KING_CRIMSON,
                D4C,
                GOLD_EXPERIENCE,
                AEROSMITH,
                WEATHER_REPORT,
                KILLER_QUEEN,
                CRAZY_DIAMOND,
                PURPLE_HAZE,
                THE_EMPEROR,
                WHITESNAKE,
                THE_WORLD,
                STAR_PLATINUM,
                SILVER_CHARIOT,
                MAGICIANS_RED,
                THE_HAND
        };
    }

    public static class KeyCodes {
        public static final String SUMMON_STAND = KeyInit.SPAWN_STAND.getLocalizedName().toUpperCase();
        public static final String ABILITY_TOGGLE = KeyInit.TOGGLE_ABILITY.getLocalizedName().toUpperCase();
        public static final String ABILITY_1 = KeyInit.ABILITY1.getLocalizedName().toUpperCase();
        public static final String ABILITY_2 = KeyInit.ABILITY2.getLocalizedName().toUpperCase();
    }
}
