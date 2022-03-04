package net.gabriele.clashofmobs.event;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.ArcherTowerEntity;
import net.gabriele.clashofmobs.entity.EntityInit;
import net.gabriele.clashofmobs.entity.pekka.PekkaModel;
import net.gabriele.clashofmobs.entity.render.AoE.poison.PoisonModel;
import net.gabriele.clashofmobs.entity.render.AoE.poison.PoisonRenderer;
import net.gabriele.clashofmobs.entity.render.DragonEntityModel;
import net.gabriele.clashofmobs.entity.render.DragonRenderer;
import net.gabriele.clashofmobs.entity.render.archer.ArcherEntityModel;
import net.gabriele.clashofmobs.entity.render.archer.ArcherRenderer;
import net.gabriele.clashofmobs.entity.render.archertower.ArcherTowerModel;
import net.gabriele.clashofmobs.entity.render.archertower.ArcherTowerRenderer;
import net.gabriele.clashofmobs.entity.render.hogrider.HogRiderModel;
import net.gabriele.clashofmobs.entity.render.hogrider.HogRiderRenderer;
import net.gabriele.clashofmobs.entity.render.pekka.PekkaRender;
import net.gabriele.clashofmobs.entity.render.valkyrie.ValkyrieModel;
import net.gabriele.clashofmobs.entity.render.valkyrie.ValkyrieRenderer;
import net.gabriele.clashofmobs.entity.render.wallbreaker.WallBreakerModel;
import net.gabriele.clashofmobs.entity.render.wallbreaker.WallBreakerRenderer;
import net.gabriele.clashofmobs.entity.witch.WitchModel;
import net.gabriele.clashofmobs.entity.witch.WitchRenderer;
import net.gabriele.clashofmobs.entity.xbow.XbowModel;
import net.gabriele.clashofmobs.entity.xbow.XbowRenderer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= Clashofmobs.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public final class ClientEvent {
    private ClientEvent()
    {

    }
    @SubscribeEvent
    public static void clientSetup(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(DragonEntityModel.LAYER_LOCATION, DragonEntityModel::createBodyLayer);
        event.registerLayerDefinition(HogRiderModel.LAYER_LOCATION, HogRiderModel::createBodyLayer);
        event.registerLayerDefinition(ArcherEntityModel.LAYER_LOCATION, ArcherEntityModel::createBodyLayer);
        event.registerLayerDefinition(WallBreakerModel.LAYER_LOCATION, WallBreakerModel::createBodyLayer);
        event.registerLayerDefinition(ArcherTowerModel.LAYER_LOCATION, ArcherTowerModel::createBodyLayer);
        event.registerLayerDefinition(ValkyrieModel.LAYER_LOCATION, ValkyrieModel::createBodyLayer);
        event.registerLayerDefinition(XbowModel.LAYER_LOCATION, XbowModel::createBodyLayer);
        event.registerLayerDefinition(WitchModel.LAYER_LOCATION, WitchModel::createBodyLayer);
        event.registerLayerDefinition(PoisonModel.LAYER_LOCATION, PoisonModel::createBodyLayer);
        event.registerLayerDefinition(PekkaModel.LAYER_LOCATION, PekkaModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerRenders(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(EntityInit.DRAGON.get(), DragonRenderer::new);
        event.registerEntityRenderer(EntityInit.HOG_RIDER.get(), HogRiderRenderer::new);
        event.registerEntityRenderer(EntityInit.ARCHER.get(), ArcherRenderer::new);
        event.registerEntityRenderer(EntityInit.WALL_BREAKER.get(), WallBreakerRenderer::new);
        event.registerEntityRenderer(EntityInit.ARCHER_TOWER.get(), ArcherTowerRenderer::new);
        event.registerEntityRenderer(EntityInit.VALKYRIE.get(), ValkyrieRenderer::new);
        event.registerEntityRenderer(EntityInit.XBOW.get(), XbowRenderer::new);
        event.registerEntityRenderer(EntityInit.WITCH.get(), WitchRenderer::new);
        event.registerEntityRenderer(EntityInit.POISON_AREA.get(), PoisonRenderer::new);
        event.registerEntityRenderer(EntityInit.PEKKA.get(), PekkaRender::new);
    }

}
