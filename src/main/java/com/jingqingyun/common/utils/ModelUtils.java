package com.jingqingyun.common.utils;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * ModelUtils
 *
 * @author jingqingyun
 * @date 2020-09-07
 */
public class ModelUtils {

    public static <T, R> Function<T, R> convert(Class<R> resultClass) {
        return input -> convert(input, resultClass);
    }

    public static <T, R> List<R> convert(List<T> t, Class<R> resultClass) {
        Objects.requireNonNull(t, "Input must not be null");
        return t.stream().map(convert(resultClass)).collect(Collectors.toList());
    }

    public static <T, R> R convert(T t, Class<R> resultClass) {
        R result = BeanUtils.instantiateClass(resultClass);
        BeanUtils.copyProperties(t, result);
        return result;
    }

}
