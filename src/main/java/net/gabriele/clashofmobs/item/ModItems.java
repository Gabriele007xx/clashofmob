package net.gabriele.clashofmobs.item;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.EntityInit;
import net.gabriele.clashofmobs.item.custom.DEModArmorItem;
import net.gabriele.clashofmobs.item.custom.EModArmorItem;
import net.gabriele.clashofmobs.item.custom.ModTiers;
import net.gabriele.clashofmobs.spells.Effect;
import net.gabriele.clashofmobs.spells.PoisonSpell;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Clashofmobs.MOD_ID);




        public static final RegistryObject<Item> ELIXIR = ITEMS.register("elixir", ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DARK_ELIXIR = ITEMS.register("dark_elixir", ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DARK_SWORD = ITEMS.register("dark_sword",
            ()->new SwordItem(ModTiers.DARK_ELIXIR,3,1f,new Item.Properties()
                    .tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> POISON_SPELL_ITEM = ITEMS.register("poison_spell_item",
            ()->new PoisonSpell(1,1,2, Effect.HARMFUL));
        // spawn eggs
        public static final RegistryObject<ForgeSpawnEggItem> DRAGON_SPAWN_EGG =
                ITEMS.register("dragon_spawn_egg",()-> new ForgeSpawnEggItem(EntityInit.DRAGON,0x833EFB,0x683EFB,new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<ForgeSpawnEggItem> HOG_RIDER_SPAWN_EGG =
            ITEMS.register("hog_rider_spawn_egg",()-> new ForgeSpawnEggItem(EntityInit.HOG_RIDER,0x833EFB,0x683EFB,new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<ForgeSpawnEggItem> ARCHER_SPAWN_EGG =
            ITEMS.register("archer_spawn_egg",()-> new ForgeSpawnEggItem(EntityInit.ARCHER,0x833EFB,0x683EFB,new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<ForgeSpawnEggItem> WALL_BREAKER_SPAWN_EGG =
            ITEMS.register("wall_breaker_spawn_egg",()-> new ForgeSpawnEggItem(EntityInit.WALL_BREAKER,0x833EFB,0x683EFB,new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<ForgeSpawnEggItem> ARCHER_TOWER_SPAWN_EGG =
            ITEMS.register("archer_tower_spawn_egg",()-> new ForgeSpawnEggItem(EntityInit.ARCHER_TOWER,0x833EFB,0x000000,new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<ForgeSpawnEggItem> VALKYRIE_SPAWN_EGG =
            ITEMS.register("valkyrie_spawn_egg",()-> new ForgeSpawnEggItem(EntityInit.VALKYRIE,0x833EFB,0x683EFB,new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<ForgeSpawnEggItem> XBOW_SPAWN_EGG =
            ITEMS.register("xbow_spawn_egg",()-> new ForgeSpawnEggItem(EntityInit.XBOW,0x833EFB,0x000000,new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    //Armor
    //Elixir Armor
    public static final RegistryObject<Item> ELIXIR_BOOTS = ITEMS.register("elixir_boots",
            ()->new EModArmorItem(ModArmorMaterial.ELIXIR, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ELIXIR_LEGGINGS = ITEMS.register("elixir_leggings",
            ()->new EModArmorItem(ModArmorMaterial.ELIXIR, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ELIXIR_CHESTPLATE = ITEMS.register("elixir_chestplate",
            ()->new EModArmorItem(ModArmorMaterial.ELIXIR, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ELIXIR_HELMET = ITEMS.register("elixir_helmet",
            ()->new EModArmorItem(ModArmorMaterial.ELIXIR, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    //Dark Elixir Armor piece
    public static final RegistryObject<Item> DARK_ELIXIR_BOOTS = ITEMS.register("dark_elixir_boots",
            ()->new DEModArmorItem(ModArmorMaterial.DARK_ELIXIR, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DARK_ELIXIR_LEGGINGS = ITEMS.register("dark_elixir_leggings",
            ()->new DEModArmorItem(ModArmorMaterial.DARK_ELIXIR, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DARK_ELIXIR_CHESTPLATE = ITEMS.register("dark_elixir_chestplate",
            ()->new DEModArmorItem(ModArmorMaterial.DARK_ELIXIR, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DARK_ELIXIR_HELMET = ITEMS.register("dark_elixir_helmet",
            ()->new DEModArmorItem(ModArmorMaterial.DARK_ELIXIR, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

        public static void register(IEventBus eventBus)
        {
            ITEMS.register(eventBus);
        }

}
