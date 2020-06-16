package com.xfor.email.manage.manager;

import java.util.concurrent.TimeUnit;

/**
 *
 */
public enum RedisExpireEnum {

    //未读消息的有效期为30天
    UNREAD_MSG(30L, TimeUnit.DAYS);

    /**
     * 过期时间
     */
    private Long time;
    /**
     * 时间单位
     */
    private TimeUnit timeUnit;

    RedisExpireEnum(Long time, TimeUnit timeUnit) {
        this.time = time;
        this.timeUnit = timeUnit;
    }

    public Long getTime() {
        return time;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }
}
