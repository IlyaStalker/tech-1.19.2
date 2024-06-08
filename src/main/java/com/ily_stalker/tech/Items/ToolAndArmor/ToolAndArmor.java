package com.ily_stalker.tech.Items.ToolAndArmor;

import com.ily_stalker.tech.CreativeTab.CreativeTabRawOre;
import com.ily_stalker.tech.CreativeTab.CreativeTabToolsAndArmor;
import com.ily_stalker.tech.Items.ToolAndArmor.Material.MaterialCopper;
import com.ily_stalker.tech.TechCore;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolAndArmor {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechCore.MOD_ID);

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper-sword",
            () -> new SwordItem(MaterialCopper.INGOTCOPPER, 3, -2.4F, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper-pickaxe",
            () -> new PickaxeItem(MaterialCopper.INGOTCOPPER,1, -1.0F, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper-axe",
            () -> new AxeItem(MaterialCopper.INGOTCOPPER, 6, -3.4F, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper-shovel",
            () -> new ShovelItem(MaterialCopper.INGOTCOPPER, 1, -1.0F, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper-hoe",
            () -> new HoeItem(MaterialCopper.INGOTCOPPER, 0, -1.0F, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

}
