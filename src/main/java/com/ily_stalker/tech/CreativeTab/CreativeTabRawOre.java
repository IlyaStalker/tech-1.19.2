package com.ily_stalker.tech.CreativeTab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.ily_stalker.tech.Items.RawOre.RawOreInit.*;

public class CreativeTabRawOre extends CreativeModeTab {
        private CreativeTabRawOre(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RAWORETIN.get());
        }

        public static final CreativeTabRawOre instance = new CreativeTabRawOre(CreativeModeTab.TABS.length, "raw-ore");
}
