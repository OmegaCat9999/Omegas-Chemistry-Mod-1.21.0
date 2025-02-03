package net.omegacat9999.chemistrymod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.omegacat9999.chemistrymod.OmegasChemistryMod;

public class ModBlocks {
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(OmegasChemistryMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(OmegasChemistryMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        // Log Block Register Indicator (Debugging)
        OmegasChemistryMod.LOGGER.info("Registering Mod Items for" + OmegasChemistryMod.MOD_ID);

        // Call registerItem Method for INGREDIENTS Vanilla Item Group (directly)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(entries -> {
                    // entries.add();
                });
    }
}
