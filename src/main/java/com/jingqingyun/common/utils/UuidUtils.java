package com.jingqingyun.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * TracdIdGenerator
 *
 * @author jingqingyun
 * @date 2020-09-06
 */
public class UuidUtils {

    public static String nextId() {
        String uuid = UUID.randomUUID().toString();
        return StringUtils.remove(uuid, '-');
    }

}
