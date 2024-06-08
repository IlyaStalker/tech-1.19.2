package com.ily_stalker.tech.Items.RawOre;

import com.ily_stalker.tech.CreativeTab.CreativeTabRawOre;
import com.ily_stalker.tech.TechCore;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import static snownee.jade.Jade.MODID;
import static snownee.jade.Jade.smallItem;

public class RawOreInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechCore.MOD_ID);

    public static final RegistryObject<Item> RAWORETIN = ITEMS.register("raw-ore-tin",
            () -> new Item(new Item.Properties().tab(CreativeTabRawOre.instance)));

    public static final RegistryObject<Item> RAWORELEAD = ITEMS.register("raw-ore-lead",
            () -> new Item(new Item.Properties().tab(CreativeTabRawOre.instance)));
}
