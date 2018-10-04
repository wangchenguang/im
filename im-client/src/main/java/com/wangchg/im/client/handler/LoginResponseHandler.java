package com.wangchg.im.client.handler;

import com.wangchg.im.protocol.request.LoginRequestPacket;
import com.wangchg.im.protocol.response.LoginResponsePacket;
import com.wangchg.im.util.LoginUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Date;
import java.util.UUID;

public class LoginResponseHandler extends SimpleChannelInboundHandler<LoginResponsePacket> {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        LoginRequestPacket loginRequestPacket = new LoginRequestPacket();
        loginRequestPacket.setUserId(UUID.randomUUID().toString());
        loginRequestPacket.setUsername("flash");
        loginRequestPacket.setPassword("pwd");
        ctx.channel().writeAndFlush(loginRequestPacket);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, LoginResponsePacket loginResponsePacket) throws Exception {
        if (loginResponsePacket.isSuccess()) {
            System.out.println(new Date() + ":客户端登录成功");
            LoginUtil.markAsLogin(channelHandlerContext.channel());
        } else {
            System.out.println(new Date() + ":客户端登录失败，原因：" + loginResponsePacket.getReason());
        }
    }
}
