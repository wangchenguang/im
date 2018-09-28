package com.wangchg.im.attribute;

import io.netty.util.AttributeKey;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/9/28
 */
public interface Attributes {
    AttributeKey<Boolean> LOGIN = AttributeKey.newInstance("login");
}
