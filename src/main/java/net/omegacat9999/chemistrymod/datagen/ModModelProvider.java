package net.omegacat9999.chemistrymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.omegacat9999.chemistrymod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // blockStateModelGenerator.registerSimpleCubeAll();
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CARBON, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARBON_ELEMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HYDROGEN_ELEMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HYDROGEN, Models.GENERATED);

    }
}
