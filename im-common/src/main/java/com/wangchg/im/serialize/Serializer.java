package com.wangchg.im.serialize;

import com.wangchg.im.serialize.impl.JSONSerializer;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
public interface Serializer {
    Serializer DEFAULT = new JSONSerializer();

    /**
     * 序列化算法
     *
     * @return
     */
    byte getSerializerAlogrithm();

    /**
     * java对象转换成二进制
     *
     * @param obj
     * @return
     */
    byte[] serialize(Object obj);

    /**
     * 二进制转java对象
     *
     * @param clazz
     * @param bytes
     * @param <T>
     * @return
     */
    <T> T deserialize(Class<T> clazz, byte[] bytes);
}
