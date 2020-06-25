package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * Created by Rain on 2020/5/24.
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

}
