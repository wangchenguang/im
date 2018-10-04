package com.wangchg.im.server.handler;

import com.wangchg.im.protocol.request.MessageRequestPacket;
import com.wangchg.im.protocol.response.MessageResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.joda.time.DateTime;

public class MessageRequestHandler extends SimpleChannelInboundHandler<MessageRequestPacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, MessageRequestPacket messageRequestPacket) throws Exception {
        MessageResponsePacket messageResponsePacket = new MessageResponsePacket();
        System.out.println(new DateTime().toString("yyyy-MM-dd hh:mm:ss") + ":收到客户端消息:" + messageRequestPacket.getMessage());
        messageResponsePacket.setMessage("服务端回复【" + messageRequestPacket.getMessage() + "】");
        channelHandlerContext.channel().writeAndFlush(messageResponsePacket);
    }
}
