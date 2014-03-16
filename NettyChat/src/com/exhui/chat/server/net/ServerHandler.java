package com.exhui.chat.server.net;

import java.util.logging.Logger;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

import com.exhui.chat.server.clients.Client;
import com.exhui.chat.server.clients.World;
import com.exhui.chat.server.clients.chat.Chat;
import com.exhui.chat.server.net.packet.Packet;
import com.exhui.chat.server.net.packet.PacketHandler;

public class ServerHandler extends SimpleChannelHandler {
	
	private final Logger logger = Logger.getLogger(this.getClass().getName());
	
	private final PacketHandler packetHandler = new PacketHandler();
	
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {
		//当一个远程消息对象(如: ChannelBuffer)被接收时调用. 
		Packet packet = (Packet) e.getMessage();
		if(packet != null) {
			packetHandler.handle(World.getWorld().getClient(ctx.getChannel()), packet);
		}
	}
	
	@Override
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
		//当一个Channel打开并且绑定到本地地址和已连接到远程地址时被调用. 
		World.getWorld().register(new Client(ctx.getChannel()));
	}
	
	@Override
	public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
		//当一个Channel被远程端断开连接时调用. 
		Client client = World.getWorld().getClient(ctx.getChannel());
		World.getWorld().unregister(client);
		World.getWorld().updateUserList();
		Chat chat = client.getChat();
		if(chat != null) {
			chat.remove(client);
		}
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
		logger.info("Exception caught: " + e.getCause());
	}

}
