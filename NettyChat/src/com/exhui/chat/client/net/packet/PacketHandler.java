package com.exhui.chat.client.net.packet;

import com.exhui.chat.client.net.packet.handled.ChatPacketHandler;
import com.exhui.chat.client.net.packet.handled.ClearPacketHandler;
import com.exhui.chat.client.net.packet.handled.DefaultPacketHandler;
import com.exhui.chat.client.net.packet.handled.ErrorPacketHandler;
import com.exhui.chat.client.net.packet.handled.UpdateUsersPacketHandler;

public class PacketHandler {
	
	public void handle(Packet packet) {
		switch(packet.getOpcode()) {
		case 0:
			new ErrorPacketHandler().handle(packet);
			break;
		case 1:
			new ChatPacketHandler().handle(packet);
			break;
		case 2:
			new ClearPacketHandler().handle(packet);
			break;
		case 3:
			new UpdateUsersPacketHandler().handle(packet);
		default:
			new DefaultPacketHandler().handle(packet);
			break;
		}
	}

}
