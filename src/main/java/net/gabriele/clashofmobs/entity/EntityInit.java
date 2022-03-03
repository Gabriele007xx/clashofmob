package net.gabriele.clashofmobs.entity;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.AoE.poison_area.PoisonEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class EntityInit {
    private EntityInit()
    {

    }
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Clashofmobs.MOD_ID);
    public static final RegistryObject<EntityType<DragonEntity>> DRAGON =
            ENTITIES.register("dragon", ()->EntityType.Builder.of(DragonEntity::new,
                    MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).sized(3f,3f)
                    .updateInterval(3).build(new ResourceLocation(Clashofmobs.MOD_ID,"dragon").toString()));
    public static final RegistryObject<EntityType<HogRiderEntity>> HOG_RIDER =
            ENTITIES.register("hog_rider", ()->EntityType.Builder.of(HogRiderEntity::new,
                    MobCategory.MONSTER).sized(0.6f,1.7f).build(new ResourceLocation(Clashofmobs.MOD_ID,"hog_rider").toString()));
    public static final RegistryObject<EntityType<ArcherEntity>> ARCHER =
            ENTITIES.register("archer", ()->EntityType.Builder.of(ArcherEntity::new,
                            MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).sized(1f,1f)
                    .updateInterval(3).build(new ResourceLocation(Clashofmobs.MOD_ID,"archer").toString()));
    public static final RegistryObject<EntityType<WallBreakerEntity>> WALL_BREAKER =
            ENTITIES.register("wall_breaker", ()->EntityType.Builder.of(WallBreakerEntity::new,
                            MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).sized(1f,2f)
                    .updateInterval(3).build(new ResourceLocation(Clashofmobs.MOD_ID,"wall_breaker").toString()));
    public static final RegistryObject<EntityType<ArcherTowerEntity>> ARCHER_TOWER =
            ENTITIES.register("archer_tower", ()->EntityType.Builder.of(ArcherTowerEntity::new,
                            MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).sized(3f,3f)
                    .updateInterval(3).build(new ResourceLocation(Clashofmobs.MOD_ID,"archer_tower").toString()));
    public static final RegistryObject<EntityType<ValkyrieEntity>> VALKYRIE =
            ENTITIES.register("valkyrie", ()->EntityType.Builder.of(ValkyrieEntity::new,
                            MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).sized(1f,2f)
                    .updateInterval(3).build(new ResourceLocation(Clashofmobs.MOD_ID,"valkyrie").toString()));
    public static final RegistryObject<EntityType<XbowEntity>> XBOW =
            ENTITIES.register("xbow", ()->EntityType.Builder.of(XbowEntity::new,
                            MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).sized(2f,2f)
                    .updateInterval(3).build(new ResourceLocation(Clashofmobs.MOD_ID,"xbow").toString()));
    public static final RegistryObject<EntityType<WitchEntity>> WITCH =
            ENTITIES.register("witch_coc", ()->EntityType.Builder.of(WitchEntity::new,
                            MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).sized(1f,2f)
                    .updateInterval(3).build(new ResourceLocation(Clashofmobs.MOD_ID,"witch_coc").toString()));
    public static final RegistryObject<EntityType<PoisonEntity>> POISON_AREA =
            ENTITIES.register("poison_area", ()->EntityType.Builder.of(PoisonEntity::new,
                            MobCategory.MISC).setShouldReceiveVelocityUpdates(true).sized(0.1f,0.1f)
                    .updateInterval(3).build(new ResourceLocation(Clashofmobs.MOD_ID,"poison_area").toString()));
}
