package net.omegacat9999.chemistrymod.item.custom;

import com.google.gson.*;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;

public class ModItem extends Item {
    public ModItem(Settings settings) {
        super(settings);
    }

    public String molecular_formula;
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

    public String getModItemName (){
        return getName().getString().toLowerCase();
    }

    private void build_molecular_formula() {
        for (String s : composition_ratio) {
            molecular_formula += s.substring(0, s.indexOf(':'));
            molecular_formula += s.substring(s.indexOf(':') + 1);
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.omegachemistry." + getModItemName() + ".molecular_formula"));
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.omegachemistry." + getModItemName() + ".advanced"));
        } else {
            tooltip.add(Text.translatable("tooltip.omegachemistry." + getModItemName() + ".basic"));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
