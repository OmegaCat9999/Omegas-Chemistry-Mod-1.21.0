package net.omegacat9999.chemistrymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.omegacat9999.chemistrymod.OmegasChemistryMod;

public class ModItemGroups {
    public static final ItemGroup ELEMENT_ELEMENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OmegasChemistryMod.MOD_ID, "omegachemistry-elements_element"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.omegachemistry.elements_element"))
                    .icon(() -> new ItemStack(ModItems.HYDROGEN_ELEMENT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HYDROGEN_ELEMENT);
                        entries.add(ModItems.CARBON_ELEMENT);
                    }).build());

    public static final ItemGroup ELEMENT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OmegasChemistryMod.MOD_ID, "omegachemistry-elements"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.omegachemistry.elements"))
                    .icon(() -> new ItemStack(ModItems.HYDROGEN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CARBON);
                        entries.add(ModItems.HYDROGEN);
                    }).build());

    public static final ItemGroup COMPOUND_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OmegasChemistryMod.MOD_ID, "omegachemistry-compounds"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.omegachemistry.compounds"))
                    .icon(() -> new ItemStack(ModItems.METHANE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.METHANE);
                    }).build());


    public static void RegisterItemGroups() {
        OmegasChemistryMod.LOGGER.info("Registering Mod Item Groups for" + OmegasChemistryMod.MOD_ID);
    }
}
