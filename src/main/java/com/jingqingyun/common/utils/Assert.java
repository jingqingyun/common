package com.jingqingyun.common.utils;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import com.jingqingyun.common.exception.BusinessException;

import java.util.Collection;
import java.util.Map;

/**
 * Assert
 *
 * @author jingqingyun
 * @date 2020-02-25
 */
public class Assert {

    /**
     * 条件不成立抛出异常
     *
     * @param expression 条件
     * @param message    异常信息
     */
    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new BusinessException(message);
        }
    }

    /**
     * 条件成立抛出异常
     *
     * @param expression 条件
     * @param message    异常信息
     */
    public static void isFalse(boolean expression, String message) {
        isTrue(!expression, message);
    }

    public static void notNull(Object obj, String message) {
        if (obj == null) {
            throw new BusinessException(message);
        }
    }

    public static void notEmpty(Collection<?> collection, String msg) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new BusinessException(msg);
        }
    }

    public static void notEmpty(Map map, String msg) {
        if (map == null || map.size() == 0) {
            throw new BusinessException(msg);
        }
    }

    public static void notBlaank(String string, String msg) {
        if (StringUtils.isBlank(string)) {
            throw new BusinessException(msg);
        }
    }

}
