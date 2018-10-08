package com.wangchg.im.protocol.request;

import com.wangchg.im.protocol.Packet;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.wangchg.im.protocol.command.Command.LOGIN_REQUEST;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
@Data
@NoArgsConstructor
public class LoginRequestPacket extends Packet {
    private String userName;
    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
