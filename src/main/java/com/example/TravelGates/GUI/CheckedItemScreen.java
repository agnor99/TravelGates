package com.example.TravelGates.GUI;

import com.example.TravelGates.util.GateInfo;
import com.example.TravelGates.util.GateInfoHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.CheckboxButton;
import net.minecraft.util.text.ITextComponent;

import java.util.ListIterator;

public class CheckedItemScreen extends Screen {

    protected CheckedItemScreen(ITextComponent titleIn) {
        super(titleIn);
    }

    public void AddItemToList(String ID)
    {

    }

    public void RemoveItemFromList(String ID)
    {

    }

    protected void init()
    {

    }


    public void NextPage()
    {

    }

    public void PreviousPage()
    {

    }

    public void Accept()
    {

    }


    @Override
    public void render(int mouseX, int mouseY, float partialTicks)
    {
        super.render(mouseX,mouseY,partialTicks);

    }

    public static void open(GateScreen parentScreen)
    {
        Minecraft.getInstance().displayGuiScreen(new DestinationSelectionScreen(parentScreen));

    }

    @Override
    public boolean isPauseScreen()
    {
        return false;
    }
}
