package com.exhui.chat.client.net;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;

import com.exhui.chat.client.net.handlers.ClientDecoder;
import com.exhui.chat.client.net.handlers.ClientEncoder;

public class ClientPipelineFactory implements ChannelPipelineFactory {

	@Override
	public ChannelPipeline getPipeline() throws Exception {
		ChannelPipeline pipeline = Channels.pipeline();
		pipeline.addLast("decoder", new ClientDecoder());
		pipeline.addLast("encoder", new ClientEncoder());
		pipeline.addLast("handler", new ClientHandler());
		return pipeline;
	}

}
