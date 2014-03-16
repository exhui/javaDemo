package com.exhui.chat.client.net.packet.handled;

import com.exhui.chat.client.Client;
import com.exhui.chat.client.net.packet.Packet;
import com.exhui.chat.client.panels.util.Utils;

public class UpdateUsersPacketHandler {

	public void handle(Packet packet) {
		if(packet.getBuffer().readableBytes() > 0) {
			int users = packet.get();
			String[] s = new String[users];
			for(int i = 0; i < users; i++) {
				s[i] = packet.getString();
			}
			Client.getInstance().updateUserList(s);
		} else {
			Client.getInstance().updateUserList(Utils.EMPTY_LIST);
		}
	}

}
