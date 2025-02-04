package net.omegacat9999.chemistrymod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.omegacat9999.chemistrymod.datagen.ModBlockTagProvider;
import net.omegacat9999.chemistrymod.datagen.ModItemTagProvider;
import net.omegacat9999.chemistrymod.datagen.ModLootTableProvider;
import net.omegacat9999.chemistrymod.datagen.ModModelProvider;

public class OmegasChemistryModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
