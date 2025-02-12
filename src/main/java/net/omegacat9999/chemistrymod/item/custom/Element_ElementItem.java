package net.omegacat9999.chemistrymod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class Element_ElementItem extends Item {
    public Element_ElementItem(Settings settings) {
        super(settings);
    }

    public String getElement_ElementName() {
        return this.getName().getString().toLowerCase() + "_element";
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.omegachemistry." + this.getElement_ElementName() + ".advanced"));
        } else {
            tooltip.add(Text.translatable("tooltip.omegachemistry" + this.getElement_ElementName() + ".basic"));
        }
        super.appendTooltip(stack, context, tooltip, type);
        this.getName();
    }
}