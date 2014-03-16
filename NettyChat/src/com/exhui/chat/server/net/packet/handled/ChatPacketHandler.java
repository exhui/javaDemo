package com.exhui.chat.server.net.packet.handled;

import com.exhui.chat.server.clients.Client;
import com.exhui.chat.server.clients.chat.Chat;
import com.exhui.chat.server.net.packet.Packet;

public class ChatPacketHandler {

	public void handle(Client client, Packet packet) {
		String s = packet.getString();
		Chat chat = client.getChat();
		if(chat != null) {
			if(client.getUsername() != null) {
				for(Client c : chat.getClients()) {
					c.sendChatMessage("[" + client.getUsername() + "]     " + s);
				}
			} else {
				client.sendErrorMessage("You need to have a nick set before you can talk.");
			}
		} else {
			client.sendErrorMessage("You are not in a chat.");
		}
	}

}
