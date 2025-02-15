package net.omegacat9999.chemistrymod.item.custom.element_element;

import net.omegacat9999.chemistrymod.item.custom.ModItem;

public class Element_ElementItem extends ModItem {

    public Element_ElementItem(Settings settings) {
        super(settings);
    }

    @Override
    public String getModItemName() {
        return super.getModItemName() + "_element";
    }
}