package com.ily_stalker.tech.CreativeTab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.ily_stalker.tech.Items.ToolAndArmor.ToolAndArmor.*;

public class CreativeTabToolsAndArmor extends CreativeModeTab {
        private CreativeTabToolsAndArmor(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(COPPER_SWORD.get());
        }

        public static final CreativeTabToolsAndArmor instance = new CreativeTabToolsAndArmor(CreativeModeTab.TABS.length, "tools-and-armor");
}
