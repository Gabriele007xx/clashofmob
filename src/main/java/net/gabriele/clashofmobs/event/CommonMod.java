package net.gabriele.clashofmobs.event;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.*;
import net.gabriele.clashofmobs.entity.AoE.poison_area.PoisonEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= Clashofmobs.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class CommonMod {
     @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event)
     {
         event.put(EntityInit.DRAGON.get(), DragonEntity.createAttributes().build());
         event.put(EntityInit.HOG_RIDER.get(), HogRiderEntity.createAttributes().build());
         event.put(EntityInit.ARCHER.get(), ArcherEntity.createAttributes().build());
         event.put(EntityInit.WALL_BREAKER.get(), WallBreakerEntity.createAttributes().build());
         event.put(EntityInit.ARCHER_TOWER.get(), ArcherTowerEntity.createAttributes().build());
         event.put(EntityInit.VALKYRIE.get(), ValkyrieEntity.createAttributes().build());
         event.put(EntityInit.XBOW.get(), XbowEntity.createAttributes().build());
         event.put(EntityInit.WITCH.get(), WitchEntity.createAttributes().build());
         event.put(EntityInit.POISON_AREA.get(), PoisonEntity.createAttributes().build());
         event.put(EntityInit.PEKKA.get(), PekkaEntity.createAttributes().build());

     }

}
