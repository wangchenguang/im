package com.wangchg.im.attribute;

import com.wangchg.im.session.Session;
import io.netty.util.AttributeKey;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/10/8
 */
public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
