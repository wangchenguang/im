package com.wangchg.im.session;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author wangchenguang
 * @version 1.0
 * @date 2018/10/8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Session {
    private String userId;
    private String userName;
}
