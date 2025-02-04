package net.omegacat9999.chemistrymod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.omegacat9999.chemistrymod.OmegasChemistryMod;

public class ModTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(OmegasChemistryMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ELEMENT_ELEMENT = createTag("elements_element_item");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(OmegasChemistryMod.MOD_ID, name));
        }
    }
}
