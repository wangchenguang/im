package com.wangchg.im.protocol.response;

import com.wangchg.im.protocol.Packet;
import lombok.Data;

import static com.wangchg.im.protocol.command.Command.MESSAGE_RESPONSE;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
@Data
public class MessageResponsePacket extends Packet {
    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_RESPONSE;
    }
}
