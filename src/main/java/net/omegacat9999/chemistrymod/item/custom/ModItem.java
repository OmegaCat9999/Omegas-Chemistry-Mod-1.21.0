package net.omegacat9999.chemistrymod.item.custom;

import com.google.gson.*;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class ModItem extends Item {
    public ModItem(Settings settings) {
        super(settings);
    }

    public float[] composition_percent = new float[128];
    public ArrayList<String> composition_ratio = new ArrayList<String>();
    /* composition_ratio: {
        "carbon:1"
        "hydrogen:4"
    }
    */
    public void composition_init(float[] c_p, ArrayList<String> c_r){
        this.composition_percent = c_p;
        this.composition_ratio = c_r;
    }
}
