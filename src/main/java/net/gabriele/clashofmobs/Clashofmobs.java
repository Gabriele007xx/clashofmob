package net.gabriele.clashofmobs;

import net.gabriele.clashofmobs.block.ModBlocks;
import net.gabriele.clashofmobs.entity.EntityInit;
import net.gabriele.clashofmobs.item.ModItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Clashofmobs.MOD_ID)
public class Clashofmobs
{
    public static final String MOD_ID = "clashofmobs";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Clashofmobs() {
        IEventBus eventBus =   FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        eventBus.addListener(this::setup);
        EntityInit.ENTITIES.register(eventBus);
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
