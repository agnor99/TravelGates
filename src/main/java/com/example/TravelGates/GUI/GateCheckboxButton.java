package com.example.TravelGates.GUI;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.CheckboxButton;

public class GateCheckboxButton extends CheckboxButton {

    public boolean checkStatus;
    public String ID;
    public CheckedItemScreen ParentScreen;

    public GateCheckboxButton(int p_i51140_1_, int p_i51140_2_, int p_i51140_3_, int p_i51140_4_, String p_i51140_5_, boolean p_i51140_6_,CheckedItemScreen parentScreen) {
        super(p_i51140_1_, p_i51140_2_, p_i51140_3_, p_i51140_4_, p_i51140_5_, p_i51140_6_);

        ParentScreen = parentScreen;
        ID = p_i51140_5_;
        checkStatus = p_i51140_6_;
    }

    @Override
    public void onPress()
    {
        super.onPress();
        this.checkStatus = !this.checkStatus;

        if(checkStatus)
        {
            ParentScreen.AddItemToList(this.ID);
        }
        else
        {
            ParentScreen.RemoveItemFromList(this.ID);
        }
    }

    @Override
    public boolean func_212942_a() {
        return this.checkStatus;
    }
}
