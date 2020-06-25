package com.imooc.utils;

import java.util.Random;

/**
 * Created by Rain on 2020/5/23.
 */
public class  KeyUtil {
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
