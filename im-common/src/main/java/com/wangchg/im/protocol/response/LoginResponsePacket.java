package com.wangchg.im.protocol.response;

import com.wangchg.im.protocol.Packet;
import lombok.Data;

import static com.wangchg.im.protocol.command.Command.LOGIN_RESPONSE;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
@Data
public class LoginResponsePacket extends Packet {
    private String userId;
    private String userName;
    private boolean success;
    private String reason;

    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
