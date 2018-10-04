package com.wangchg.im.server.handler;

import com.wangchg.im.protocol.request.LoginRequestPacket;
import com.wangchg.im.protocol.response.LoginResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.joda.time.DateTime;

public class LoginRequestHandler extends SimpleChannelInboundHandler<LoginRequestPacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, LoginRequestPacket loginRequestPacket) throws Exception {
        System.out.println(new DateTime().toString("yyyy-MM-dd HH:mm:ss") + ":收到客户端登陆请求......");

        LoginResponsePacket loginResponsePacket = new LoginResponsePacket();
        loginResponsePacket.setVersion(loginRequestPacket.getVersion());
        if (valid(loginRequestPacket)) {
            loginResponsePacket.setSuccess(true);
            System.out.println(new DateTime().toString("yyyy-MM-dd HH:mm:ss") + ":登录成功！");
        } else {
            loginResponsePacket.setReason("账号密码校验失败");
            loginResponsePacket.setSuccess(false);
            System.out.println(new DateTime().toString("yyyy-MM-dd HH:mm:ss") + "：登录失败！");
        }
        //登录响应
        channelHandlerContext.channel().writeAndFlush(loginResponsePacket);
    }

    private boolean valid(LoginRequestPacket loginRequestPacket) {
        return true;
    }
}
