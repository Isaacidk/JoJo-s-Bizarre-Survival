package io.github.novarch129.jojomod.init;

import io.github.novarch129.jojomod.JojoBizarreSurvival;
import io.github.novarch129.jojomod.JojoBizarreSurvival.JojoItemGroup;
import io.github.novarch129.jojomod.item.BeachBoyItem;
import io.github.novarch129.jojomod.item.EmperorItem;
import io.github.novarch129.jojomod.item.StandArrowItem;
import io.github.novarch129.jojomod.item.StandDiscItem;
import io.github.novarch129.jojomod.util.Util;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * This class reminds me of how stupid {@link DeferredRegister} looks when used to register lots of things.
 */
@SuppressWarnings("unused")
public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JojoBizarreSurvival.MOD_ID);

    public static final RegistryObject<Item> STAND_ARROW = ITEMS.register("stand_arrow", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("arrow", TextFormatting.YELLOW)).group(JojoItemGroup.INSTANCE), 0, "On use, grants the user the power of a STAND."));
    public static final RegistryObject<Item> SUMMON_KING_CRIMSON = ITEMS.register("summon_king_crimson", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("king_crimson", TextFormatting.DARK_RED)).group(JojoItemGroup.INSTANCE), Util.StandID.KING_CRIMSON, "Skips 10 seconds of time, allowing the user to see others movements.\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Activates Epitaph, making it's user automatically dodge all attacks for a few seconds."));
    public static final RegistryObject<Item> SUMMON_D4C = ITEMS.register("summon_d4c", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("d4c", TextFormatting.AQUA)).group(JojoItemGroup.INSTANCE), Util.StandID.D4C, "Allows the user to hop to parallel worlds when between two objects.\n\nControls (All abilities require user to be holding either a Shield or a Banner): \n" + Util.KeyCodes.ABILITY_1 + ": Activates a short distance teleport, effectively making the user go in and out of D4C's pocket dimension rapidly.\n" + Util.KeyCodes.ABILITY_2 + ": D4C throws a punch with all of it's power, this punch is double as fast and has double the range of a regular punch, upon hitting an entity, it sends it to a parallel world."));
    public static final RegistryObject<Item> SUMMON_GOLD_EXPERIENCE = ITEMS.register("summon_gold_experience", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("gold_experience", TextFormatting.GOLD)).group(JojoItemGroup.INSTANCE), Util.StandID.GOLD_EXPERIENCE, "Has the ability to turn objects into living creatures."));
    public static final RegistryObject<Item> SUMMON_MADE_IN_HEAVEN = ITEMS.register("summon_made_in_heaven", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("made_in_heaven", TextFormatting.GREEN)).group(JojoItemGroup.INSTANCE), Util.StandID.MADE_IN_HEAVEN, "Possess the ability to accelerate the passage of time. \n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Dashes forward, seemingly teleporting Made in Heaven and it's user 70 blocks forwards. \n" + Util.KeyCodes.ABILITY_2 + ": Made in Heaven uses it's immense speed to dodge and counter all attacks for the next 10 seconds."));
    public static final RegistryObject<Item> SUMMON_AEROSMITH = ITEMS.register("summon_aerosmith", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("aerosmith", TextFormatting.LIGHT_PURPLE)).group(JojoItemGroup.INSTANCE), Util.StandID.AEROSMITH, "Remote controlled Stand, allows the user to detect entities by their breathing.\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Shoots a piece of TNT with a fuse of only 1 second."));
    public static final RegistryObject<Item> SUMMON_WEATHER_REPORT = ITEMS.register("summon_weather_report", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("weather_report", TextFormatting.WHITE)).group(JojoItemGroup.INSTANCE), Util.StandID.WEATHER_REPORT, "Possess the ability to control the weather, is there something more to this ability?\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Changes the current Weather of the world."));
    public static final RegistryObject<Item> SUMMON_KILLER_QUEEN = ITEMS.register("summon_killer_queen", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("killer_queen", TextFormatting.GRAY)).group(JojoItemGroup.INSTANCE), Util.StandID.KILLER_QUEEN, "Can turn anything it touches into a bomb.\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Activate 1st bomb.\n" + Util.KeyCodes.ABILITY_2 + ": Summon Sheer Heart Attack.\n" + Util.KeyCodes.ABILITY_3 + ": Turn held item into bomb.\n" + Util.KeyCodes.ABILITY_3 + " + Crouch: Turn block below user into bomb.\n" + Util.KeyCodes.ABILITY_1 + " + Crouch (Unlockable): Activates Bites the Dust, saves a point in time and allows it's user to return back to it at any time."));
    public static final RegistryObject<Item> SUMMON_CRAZY_DIAMOND = ITEMS.register("summon_crazy_diamond", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("crazy_diamond", TextFormatting.BLUE)).group(JojoItemGroup.INSTANCE), Util.StandID.CRAZY_DIAMOND, "Has the ability to revert objects to a previous state.\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Reverts punched blocks to their previous state, repairing them."));
    public static final RegistryObject<Item> SUMMON_PURPLE_HAZE = ITEMS.register("summon_purple_haze", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("purple_haze", TextFormatting.DARK_PURPLE)).group(JojoItemGroup.INSTANCE), Util.StandID.PURPLE_HAZE, "Releases a deadly virus into the atmosphere."));
    public static final RegistryObject<Item> SUMMON_THE_EMPEROR = ITEMS.register("summon_the_emperor", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("emperor", TextFormatting.DARK_GRAY)).group(JojoItemGroup.INSTANCE), Util.StandID.THE_EMPEROR, "The Emperor acts like a gun, dealing massive damage to entities it hits."));
    public static final RegistryObject<Item> SUMMON_WHITESNAKE = ITEMS.register("summon_whitesnake", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("whitesnake", TextFormatting.WHITE)).group(JojoItemGroup.INSTANCE), Util.StandID.WHITESNAKE, "Possesses the ability to take players' Stands and turn them into discs."));
    public static final RegistryObject<Item> SUMMON_CMOON = ITEMS.register("summon_cmoon", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("cmoon", TextFormatting.DARK_GREEN)).group(JojoItemGroup.INSTANCE), Util.StandID.CMOON, "Has almost perfect control over gravity, allows the user to levitate and invert entities."));
    public static final RegistryObject<Item> SUMMON_THE_WORLD = ITEMS.register("summon_the_world", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("the_world", TextFormatting.YELLOW)).group(JojoItemGroup.INSTANCE), Util.StandID.THE_WORLD, "Allows it's user to stop the passage of time for a maximum of 11 seconds, widely regarded to be the strongest Stand.\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Stops time briefly and walks forwards, effectively teleporting.\n" + Util.KeyCodes.ABILITY_2 + ": Dodges all attacks by stopping time and moving behind the attacking entity."));
    public static final RegistryObject<Item> SUMMON_STAR_PLATINUM = ITEMS.register("summon_star_platinum", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("star_platinum", TextFormatting.DARK_PURPLE)).group(JojoItemGroup.INSTANCE), Util.StandID.STAR_PLATINUM, "Allows it's user to stop the flow of time for up to 5 seconds, akin to The World, only weaker.\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Stops time briefly and walks forwards, effectively teleporting.\n" + Util.KeyCodes.ABILITY_2 + ": Dodges all attacks by stopping time and moving behind the attacking entity."));
    public static final RegistryObject<Item> SUMMON_SILVER_CHARIOT = ITEMS.register("summon_silver_chariot", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("silver_chariot", TextFormatting.GRAY)).group(JojoItemGroup.INSTANCE), Util.StandID.SILVER_CHARIOT, "Possesses a sword that can cut through most any mob with ease, can take off it's armor for extra speed."));
    public static final RegistryObject<Item> SUMMON_MAGICIANS_RED = ITEMS.register("summon_magicians_red", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("magicians_red", TextFormatting.RED)).group(JojoItemGroup.INSTANCE), Util.StandID.MAGICIANS_RED, "Can control and create flames, does not make it's user flame proof.\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Shoots out the Crossfire Hurricane, an explosive flame blast."));
    public static final RegistryObject<Item> SUMMON_THE_HAND = ITEMS.register("summon_the_hand", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("the_hand", TextFormatting.DARK_BLUE)).group(JojoItemGroup.INSTANCE), Util.StandID.THE_HAND, "Erases anything it's right hand swipes at, very slow Stand.\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Swipes away the space between itself and an entity, effectively pulling it.\n" + Util.KeyCodes.ABILITY_2 + ": Swipes away the space in front of it's master, teleporting them forwards."));
    public static final RegistryObject<Item> SUMMON_HIEROPHANT_GREEN = ITEMS.register("summon_hierophant_green", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("hierophant_green", TextFormatting.GREEN)).group(JojoItemGroup.INSTANCE), Util.StandID.HIEROPHANT_GREEN, "Long range Stand, can use it' tail to whip and throw the Emerald splash.\n\nControls: \nBasic attack + Ability ON: Whips an entity with it's tail possessing it and allowing it's user to control it."));
    public static final RegistryObject<Item> SUMMON_GREEN_DAY = ITEMS.register("summon_green_day", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("green_day", TextFormatting.DARK_GREEN)).group(JojoItemGroup.INSTANCE), Util.StandID.GREEN_DAY, "Can spread a fungal infection to entities that descend from their current position."));
    public static final RegistryObject<Item> SUMMON_20TH_CENTURY_BOY = ITEMS.register("summon_20th_century_boy", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("20th_century_boy", TextFormatting.DARK_BLUE)).group(JojoItemGroup.INSTANCE), Util.StandID.TWENTIETH_CENTURY_BOY, "Makes it's user completely invincible, but prevents them from moving."));
    public static final RegistryObject<Item> SUMMON_THE_GRATEFUL_DEAD = ITEMS.register("summon_the_grateful_dead", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("the_grateful_dead", TextFormatting.GREEN)).group(JojoItemGroup.INSTANCE), Util.StandID.THE_GRATEFUL_DEAD, "Speeds up aging of crops and entities, making them either grow faster or gain negative effects from aging."));
    public static final RegistryObject<Item> SUMMON_STICKY_FINGERS = ITEMS.register("summon_sticky_fingers", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("sticky_fingers", TextFormatting.DARK_BLUE)).group(JojoItemGroup.INSTANCE), Util.StandID.STICKY_FINGERS, "Possesses the ability to create zippers on objects and entities.\n\nControls: \n" + Util.KeyCodes.ABILITY_TOGGLE + ": Rapidly places zippers on the ground, allowing it's user to swim through the floor.\n" + Util.KeyCodes.ABILITY_1 + ": Puts a zipper on an entity and jumps inside of it, hiding itself and it's user.\n" + Util.KeyCodes.ABILITY_2 + ": Puts a zipper on a wall and passes through it.\n" + Util.KeyCodes.ABILITY_3 + ": Unzips it's arm and punches with it going 5 times as far as a regular punch."));
    public static final RegistryObject<Item> SUMMON_TUSK_ACT_1 = ITEMS.register("summon_tusk_act_1", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("tusk_act_1", TextFormatting.LIGHT_PURPLE)).group(JojoItemGroup.INSTANCE), Util.StandID.TUSK_ACT_1, "Has the ability to charge and shoot bullets made from the user's nails."));
    public static final RegistryObject<Item> SUMMON_TUSK_ACT_2 = ITEMS.register("summon_tusk_act_2", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("tusk_act_2", TextFormatting.LIGHT_PURPLE)).group(JojoItemGroup.INSTANCE), Util.StandID.TUSK_ACT_2, "Can shoot homing nail bullets, deals double the damage of Act 1 but has double the cooldown. Drinking honey bottles reduces the cooldown."));
    public static final RegistryObject<Item> SUMMON_TUSK_ACT_3 = ITEMS.register("summon_tusk_act_3", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("tusk_act_3", TextFormatting.LIGHT_PURPLE)).group(JojoItemGroup.INSTANCE), Util.StandID.TUSK_ACT_3, "Same as Act 2, but can also shoot nails into the floor to go into the ground."));
    public static final RegistryObject<Item> SUMMON_TUSK_ACT_4 = ITEMS.register("summon_tusk_act_4", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("tusk_act_4", TextFormatting.LIGHT_PURPLE)).group(JojoItemGroup.INSTANCE), Util.StandID.TUSK_ACT_4, "Can create an infinite rotational force that makes targets spin forever, deals a max of 59 damage. All infinite rotation benefits are only applied if it's user is riding a horse."));
    public static final RegistryObject<Item> SUMMON_ECHOES_ACT_1 = ITEMS.register("summon_echoes_act_1", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("echoes_act_1", TextFormatting.GREEN)).group(JojoItemGroup.INSTANCE), Util.StandID.ECHOES_ACT_1, "Can create sound effects and place them on entities damaging them over time."));
    public static final RegistryObject<Item> SUMMON_ECHOES_ACT_2 = ITEMS.register("summon_echoes_act_2", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("echoes_act_2", TextFormatting.GREEN)).group(JojoItemGroup.INSTANCE), Util.StandID.ECHOES_ACT_2, "Can put sound effects on blocks, effects include: Sizzle, Bounce, Damage or Explode.\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Places a sound effect 2 blocks in front of Echoes' user.\n" + Util.KeyCodes.ABILITY_2 + ": Removes all currently placed sound effects."));
    public static final RegistryObject<Item> SUMMON_ECHOES_ACT_3 = ITEMS.register("summon_echoes_act_3", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("echoes_act_3", TextFormatting.GREEN)).group(JojoItemGroup.INSTANCE), Util.StandID.ECHOES_ACT_3, "Gains access to the Three Freeze attack which makes entities heavy and unable to move.\n\nControls: \n" + Util.KeyCodes.ABILITY_1 + ": Effects all entities within 7 blocks of Echoes with Three Freeze."));
    public static final RegistryObject<Item> SUMMON_BEACH_BOY = ITEMS.register("summon_beach_boy", () -> new StandArrowItem(new Item.Properties().maxStackSize(1).rarity(Rarity.create("beach_boy", TextFormatting.LIGHT_PURPLE)).group(JojoItemGroup.INSTANCE), Util.StandID.BEACH_BOY, "Acts as a fishing rod, but can also be used to attack.\n\nStates: \nFishing rod: Acts as a normal fishing rod, can also fish in lava and End portals.\nDamage: Instead of pulling entities towards itself, Beach Boy now damages entities upon pullling them.\nHoming: Beach Boy automatically homes in on entities and damages them upon pulling.\nControls: \n" + Util.KeyCodes.SWITCH_ACT + ": Switches Beach Boy's current state."));

    public static final RegistryObject<Item> STAND_DISC = ITEMS.register("stand_disc", () -> new StandDiscItem(new Item.Properties().maxStackSize(1).group(JojoItemGroup.INSTANCE)));
    public static final RegistryObject<Item> THE_EMPEROR = ITEMS.register("the_emperor", () -> new EmperorItem(new Item.Properties().maxStackSize(1)));
    public static final RegistryObject<Item> BEACH_BOY = ITEMS.register("beach_boy", () -> new BeachBoyItem(new Item.Properties().maxStackSize(1)));
    public static final RegistryObject<Item> CANZONI_PREFERITE = ITEMS.register("canzoni_preferite", () -> new MusicDiscItem(1, SoundInit.CANZONI_PREFERITE, new Item.Properties().maxStackSize(1).rarity(Rarity.RARE).group(JojoItemGroup.INSTANCE)));
}