package net.omegacat9999.chemistrymod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class CarbonElementItem extends Element_ElementItem {

    public CarbonElementItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.omegachemistry.carbon_element.advanced"));
        } else {
            tooltip.add(Text.translatable("tooltip.omegachemistry.carbon_element.basic"));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
