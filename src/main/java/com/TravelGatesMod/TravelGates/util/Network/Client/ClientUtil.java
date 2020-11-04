package com.TravelGatesMod.TravelGates.util.Network.Client;

import com.TravelGatesMod.TravelGates.GUI.GateScreen;
import com.TravelGatesMod.TravelGates.util.GateInfo;
import com.TravelGatesMod.TravelGates.util.Network.Server.UpdateGateIDPacket;
import com.TravelGatesMod.TravelGates.util.Network.Server.UpdateGatePacket;
import com.TravelGatesMod.TravelGates.util.Network.TravelGatesPacketHandler;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public class ClientUtil {


    public static void SendUpdateToServer(GateInfo info)
    {
        TravelGatesPacketHandler.INSTANCE.sendToServer(new UpdateGatePacket(info));
    }

    public static void SendIDUpdateToServer(GateInfo info, String newID)
    {
        TravelGatesPacketHandler.INSTANCE.sendToServer(new UpdateGateIDPacket(info,newID));
    }


    public static void OpenGateScreen(GateInfo info, List<String> IDs)
    {
        GateScreen screen = new GateScreen();
        screen.CallingGateInfo = info;
        screen.DirIDs = IDs;
        screen.open();
    }


}
