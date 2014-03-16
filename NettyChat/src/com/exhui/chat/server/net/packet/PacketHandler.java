package com.exhui.chat.server.net.packet;

import com.exhui.chat.server.clients.Client;
import com.exhui.chat.server.net.packet.handled.ChatPacketHandler;
import com.exhui.chat.server.net.packet.handled.CommandPacketHandler;
import com.exhui.chat.server.net.packet.handled.DefaultPacketHandler;

public class PacketHandler {
	
	public void handle(Client client, Packet packet) {
		final int opcode = packet.getOpcode();
		switch(opcode) {
		case 0:
			new CommandPacketHandler().handle(client, packet);
			break;
		case 1:
			new ChatPacketHandler().handle(client, packet);
			break;
		default:
			new DefaultPacketHandler().handle(client, packet);
			break;
		}
	}

}
