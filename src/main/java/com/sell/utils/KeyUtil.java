package com.sell.utils;

import java.util.Random;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
public class KeyUtil {


    /**
     * 生成唯一的主键
     * 格式：时间 + 随机数
     * 多线程控制
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }


}
