package com.wangchg.im.protocol.request;

import com.wangchg.im.protocol.Packet;
import lombok.Data;

import static com.wangchg.im.protocol.command.Command.MESSAGE_REQUEST;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
@Data
public class MessageRequestPacket extends Packet {
    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
