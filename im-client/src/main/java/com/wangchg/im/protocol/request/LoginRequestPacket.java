package com.wangchg.im.protocol.request;

import com.wangchg.im.protocol.Packet;
import lombok.Data;

import static com.wangchg.im.protocol.command.Command.LOGIN_REQUEST;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
@Data
public class LoginRequestPacket extends Packet {
    private String userId;
    private String username;
    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
