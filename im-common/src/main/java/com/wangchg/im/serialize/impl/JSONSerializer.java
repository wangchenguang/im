package com.wangchg.im.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.wangchg.im.serialize.Serializer;
import com.wangchg.im.serialize.SerialzerAlogrithm;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlogrithm() {
        return SerialzerAlogrithm.JSON;
    }

    @Override
    public byte[] serialize(Object obj) {
        return JSON.toJSONBytes(obj);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
