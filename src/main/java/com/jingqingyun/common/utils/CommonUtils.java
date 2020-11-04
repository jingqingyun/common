package com.jingqingyun.common.utils;

import org.apache.commons.collections.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * CommonUtils
 *
 * @author jingqingyun
 * @date 2020-09-10
 */
public class CommonUtils {

    /**
     * 小数转换为百分数
     *
     * @param value         小数
     * @param decimalPlaces 保留小数点后位数
     * @return 百分数
     */
    public static String percent(double value, int decimalPlaces) {
        String format = String.format("%%.%df%%%%", decimalPlaces);
        return String.format(format, value * 100);
    }

    public static String percent(float value, int decimalPlaces) {
        return percent((double) value, decimalPlaces);
    }

    public static <T> Optional<T> unpackOneItemList(List<T> list) {
        if (CollectionUtils.isEmpty(list)) {
            return Optional.empty();
        }
        if (list.size() > 1) {
            throw new IllegalStateException("List size > 1");
        }
        return Optional.ofNullable(list.get(0));
    }

}
