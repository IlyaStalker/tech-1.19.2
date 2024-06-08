package com.ily_stalker.tech;

import com.ily_stalker.tech.Items.RawOre.RawOreInit;
import com.ily_stalker.tech.Items.ToolAndArmor.ToolAndArmor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(TechCore.MOD_ID)
public class TechCore {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tech";

    public TechCore() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);
        RawOreInit.ITEMS.register(modEventBus);
        ToolAndArmor.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}