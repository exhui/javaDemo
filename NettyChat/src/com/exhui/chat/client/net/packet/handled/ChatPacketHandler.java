package com.exhui.chat.client.net.packet.handled;

import com.exhui.chat.client.Client;
import com.exhui.chat.client.net.packet.Packet;

public class ChatPacketHandler {

	public void handle(Packet packet) {
		String s = packet.getString();
		Client.getInstance().writeChatMessage(s);
	}

}
