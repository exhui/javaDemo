package com.exhui.chat.client.net.packet.handled;

import com.exhui.chat.client.Client;
import com.exhui.chat.client.net.packet.Packet;
import com.exhui.chat.client.panels.util.Utils;

public class ClearPacketHandler {

	public void handle(Packet packet) {
		Client.getInstance().getClientPanel().getChatArea().setText(Utils.EMPTY);
	}

}
