package net.omegacat9999.chemistrymod.item.custom;

import com.google.gson.*;
import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.omegacat9999.chemistrymod.OmegasChemistryMod;

public class ModItem extends Item {
    public ModItem(Settings settings) {
        super(settings);
    }

    public float[] composition_percent = new float[128];
    public JsonObject composition_ratio = new JsonObject();
    public void composition_init(float[] c_p, String[] c_r_e, int[] c_r_a){
        Gson gson = new Gson();
        this.composition_percent = c_p;
        if (c_r_e.length != c_r_a.length) {
            OmegasChemistryMod.LOGGER
                    .info("Amount of composition_ratio_element does not equal amount of compound_ratio_amount");
        } else {
            for (int i = 0; i < c_r_e.length; i++)
                composition_ratio.addProperty(c_r_e[i], gson.toJson(Integer.toString(c_r_a[i])));
        }
    }
}
