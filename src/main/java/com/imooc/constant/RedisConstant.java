package com.imooc.constant;

/**
 * redis常量
 * Created by Rain on 2020/5/26.
 */
public interface RedisConstant {
    String TOKEN_PREFIX = "token_%s";

    Integer EXPIRE = 7200; //2小时
}
