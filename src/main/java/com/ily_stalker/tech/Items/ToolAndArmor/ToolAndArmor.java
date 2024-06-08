package com.ily_stalker.tech.Items.ToolAndArmor;

import com.ily_stalker.tech.CreativeTab.CreativeTabToolsAndArmor;
import com.ily_stalker.tech.Items.ToolAndArmor.Material.MaterialCopperArmor;
import com.ily_stalker.tech.Items.ToolAndArmor.Material.MaterialCopperTool;
import com.ily_stalker.tech.TechCore;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolAndArmor {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechCore.MOD_ID);

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper-sword",
            () -> new SwordItem(MaterialCopperTool.INGOTCOPPER, 3, -2.4F, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper-pickaxe",
            () -> new PickaxeItem(MaterialCopperTool.INGOTCOPPER,1, -1.0F, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper-axe",
            () -> new AxeItem(MaterialCopperTool.INGOTCOPPER, 6, -3.4F, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper-shovel",
            () -> new ShovelItem(MaterialCopperTool.INGOTCOPPER, 1, -1.0F, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper-hoe",
            () -> new HoeItem(MaterialCopperTool.INGOTCOPPER, 0, -1.0F, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> PINK_HELMET = ITEMS.register("pink_helmet",
            () -> new ArmorItem(MaterialCopperArmor.COPPER_ARMOR, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> PINK_CHESTPLATE = ITEMS.register("pink_chestplate",
            () -> new ArmorItem(MaterialCopperArmor.COPPER_ARMOR, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> PINK_LEGGINGS = ITEMS.register("pink_leggings",
            () -> new ArmorItem(MaterialCopperArmor.COPPER_ARMOR, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

    public static final RegistryObject<Item> PINK_BOOTS = ITEMS.register("pink_boots",
            () -> new ArmorItem(MaterialCopperArmor.COPPER_ARMOR, EquipmentSlot.FEET, new Item.Properties().tab(CreativeTabToolsAndArmor.instance)));

}
