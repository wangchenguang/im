package com.wangchg.im.protocol.request;

import com.wangchg.im.protocol.Packet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.wangchg.im.protocol.command.Command.MESSAGE_REQUEST;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageRequestPacket extends Packet {
    private String toUserId;
    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
