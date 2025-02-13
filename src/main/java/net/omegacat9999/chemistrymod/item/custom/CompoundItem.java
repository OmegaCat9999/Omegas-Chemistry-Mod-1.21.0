package net.omegacat9999.chemistrymod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;

public class CompoundItem extends ModItem {
    public String molecular_formula;

    public CompoundItem(Settings settings, float[] C_P, ArrayList<String> C_R) {
        super(settings);
        composition_init(C_P,C_R);
    }

    public String getCompoundName() {
        return getName().getString().toLowerCase();
    }

    private void build_molecular_formula() {
        for (String s : composition_ratio) {
            molecular_formula += s.substring(s.indexOf(':') + 1);
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.omegachemistry." + getCompoundName() + "molecular_formula"));
            tooltip.add(Text.translatable("tooltip.omegachemistry." + getCompoundName() + ".advanced"));
        } else {
            tooltip.add(Text.translatable("tooltip.omegachemistry." + getCompoundName() + ".basic"));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
