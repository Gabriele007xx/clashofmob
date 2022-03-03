package net.gabriele.clashofmobs.item.custom;

import com.google.common.collect.ImmutableMap;
import net.gabriele.clashofmobs.item.ModArmorMaterial;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;

    public class DEModArmorItem extends ArmorItem {
        private static final Map<ArmorMaterial, MobEffect> MATERIAL_TO_EFFECT_MAP =
                new ImmutableMap.Builder<ArmorMaterial, MobEffect>()
                        .put(ModArmorMaterial.DARK_ELIXIR, MobEffects.JUMP).build();

        public DEModArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
            super(material, slot, settings);
        }

        @Override
        public void inventoryTick(ItemStack stack, Level world, Entity entity, int slot, boolean selected) {
            if(!world.isClientSide()) {
                if(entity instanceof Player) {
                    Player player = (Player)entity;

                    if(hasFullSuitOfArmorOn(player)) {
                        evaluateArmorEffects(player);
                    }
                }
            }

            super.inventoryTick(stack, world, entity, slot, selected);
        }

        private void evaluateArmorEffects(Player player) {
            for (Map.Entry<ArmorMaterial, MobEffect> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
                ArmorMaterial mapArmorMaterial = entry.getKey();
                MobEffect mapStatusEffect = entry.getValue();

                if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                    addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
                }
            }
        }

        private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                                MobEffect mapStatusEffect) {
            boolean hasPlayerEffect = player.hasEffect(mapStatusEffect);

            if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400,1,false,true,false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400,3,false,true,false));
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, 400,2,false,true,false));

                //if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
                //    player.getInventory().hurtArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
                //}
            }
        }

        private boolean hasFullSuitOfArmorOn(Player player) {
            ItemStack boots = player.getInventory().getArmor(0);
            ItemStack leggings = player.getInventory().getArmor(1);
            ItemStack breastplate = player.getInventory().getArmor(2);
            ItemStack helmet = player.getInventory().getArmor(3);

            return !helmet.isEmpty() && !breastplate.isEmpty()
                    && !leggings.isEmpty() && !boots.isEmpty();
        }

        private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
            ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
            ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
            ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
            ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

            return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                    leggings.getMaterial() == material && boots.getMaterial() == material;
        }
    }
