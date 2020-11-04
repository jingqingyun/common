package com.jingqingyun.common.utils;

import com.relops.snowflake.Snowflake;

/**
 * IdUtils
 *
 * @author jingqingyun
 * @date 2020/11/3
 */
public class IdUtils {

    private static Snowflake snowflake = new Snowflake(1);

    public static long next() {
        return snowflake.next();
    }

}
