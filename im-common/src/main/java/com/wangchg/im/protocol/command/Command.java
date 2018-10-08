package com.wangchg.im.protocol.command;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
public interface Command {
    Byte LOGIN_REQUEST = 1;
    Byte LOGIN_RESPONSE = 2;
    Byte MESSAGE_REQUEST = 3;
    Byte MESSAGE_RESPONSE = 4;
}
