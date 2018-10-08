package com.wangchg.im.server.handler;

import com.wangchg.im.protocol.request.LoginRequestPacket;
import com.wangchg.im.protocol.response.LoginResponsePacket;
import com.wangchg.im.session.Session;
import com.wangchg.im.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.joda.time.DateTime;

import java.util.UUID;

public class LoginRequestHandler extends SimpleChannelInboundHandler<LoginRequestPacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LoginRequestPacket loginRequestPacket) throws Exception {
        LoginResponsePacket loginResponsePacket = new LoginResponsePacket();
        loginResponsePacket.setVersion(loginRequestPacket.getVersion());
        loginResponsePacket.setUserName(loginRequestPacket.getUserName());

        if (valid(loginRequestPacket)) {
            loginResponsePacket.setSuccess(true);
            String userId = randomUserId();
            loginResponsePacket.setUserId(userId);
            System.out.println("[" + loginRequestPacket.getUserName() + "]登录成功|" + userId);
            SessionUtil.bindSession(new Session(userId, loginRequestPacket.getUserName()), ctx.channel());
        } else {
            loginResponsePacket.setReason("账号密码校验失败");
            loginResponsePacket.setSuccess(false);
            System.out.println(new DateTime().toString("yyyy-MM-dd HH:mm:ss") + "：登录失败！");
        }
        //登录响应
        ctx.channel().writeAndFlush(loginResponsePacket);
    }

    private boolean valid(LoginRequestPacket loginRequestPacket) {
        return true;
    }

    private static String randomUserId() {
        return UUID.randomUUID().toString().split("-")[0];
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        SessionUtil.unBindSession(ctx.channel());
    }
}
