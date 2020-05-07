package com.hax.demo.domain;

/**
 * 公共常量
 *
 * @Author: hax
 * @Date: 2019/10/24
 * @company: yoe
 */
public interface CommonConstant {


    /**
     * 用于IP定位转换
     */
    public static final String REGION = "内网IP|内网IP";

    /*************************************redis相关************************************/

    //redis-key-前缀-shiro:refresh_token:
    public final static String PREFIX_JWT_SESSION = "JWT-SESSION-";

    // JWT-currentTimeMillis
    public final static String CURRENT_TIME_MILLIS = "currentTimeMillis";
    //TOKEN前缀
    public static final String TOKEN_PREFIX = "AUTH-TOKEN:";

    //分布式锁
    public static final String LOCK_PREFIX = "LOCK:";

    //分布式锁超时时间
    public static final int LOCK_EXPIRE = 300; //5分钟


}
