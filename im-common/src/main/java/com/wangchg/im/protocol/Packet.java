package com.wangchg.im.protocol;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
@Data
public abstract class Packet {
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;

    @JSONField(serialize = false)
    public abstract Byte getCommand();

}
