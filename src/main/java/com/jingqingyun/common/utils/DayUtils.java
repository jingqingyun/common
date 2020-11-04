package com.jingqingyun.common.utils;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * 日期工具类
 *
 * @author jingqingyun
 * @date 2019-09-25
 */
public class DayUtils {

    /**
     * 比较日期
     *
     * @param day1 日期1
     * @param day2 日期2
     * @return 如果date1在date2之前，返回负数；如果相等，返回0；如果date1在date2之后则返回正数
     * @see DateUtils#truncatedCompareTo(Date, Date, int)
     */
    public static int dayCompare(Date day1, Date day2) {
        Objects.requireNonNull(day1);
        Objects.requireNonNull(day2);
        return DateUtils.truncatedCompareTo(day1, day2, Calendar.DAY_OF_MONTH);
    }

    /**
     * 今天和目标日期比较
     *
     * @param day 目标日期
     * @return 根据大小，分别返回负数、0和正数
     */
    public static int todayCompareTo(Date day) {
        return dayCompare(new Date(), day);
    }

    /**
     * 日期间隔绝对值
     *
     * @param start 开始日期
     * @param end   截止日期
     * @return 间隔天数绝对值
     */
    public static long absDayDuration(Date start, Date end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Parameter start and end cannot be null");
        }
        return Duration.between(start.toInstant(), end.toInstant()).abs().toDays();
    }

    /**
     * 今天到指定日期的间隔
     *
     * @param date 指定的日期
     * @return 天数间隔
     */
    public static long toTodayDuration(Date date) {
        Date today = DateUtils.truncate(new Date(), Calendar.DAY_OF_MONTH);
        return dayDuration(date, today);
    }

    /**
     * 今天到指定日期的间隔绝对值
     *
     * @param date 指定的日期
     * @return 天数间隔
     */
    public static long absToTodayDuration(Date date) {
        Date today = DateUtils.truncate(new Date(), Calendar.DAY_OF_MONTH);
        return absDayDuration(date, today);
    }

    /**
     * 两个日期的间隔
     *
     * @param start 开始日期
     * @param end   截止日期
     * @return 天数间隔
     */
    public static long dayDuration(Date start, Date end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Parameter start and end cannot be null");
        }
        return Duration.between(start.toInstant(), end.toInstant()).toDays();
    }

    /**
     * 日期是否在指定的日期中间
     *
     * @param date  日期
     * @param start 开始日期
     * @param end   截止日期，不包含在内
     * @return 是否
     */
    public static boolean isDateBetween(Date date, Date start, Date end) {
        return dayCompare(start, date) <= 0 && dayCompare(date, end) < 0;
    }

    /**
     * 今天是否在指定日期当中
     *
     * @param start 开始日期
     * @param end   截止日期，不包含在内
     * @return 是否
     */
    public static boolean isTodayBetween(Date start, Date end) {
        return isDateBetween(new Date(), start, end);
    }

    /**
     * 解析Date
     *
     * @param date    date
     * @param patrern 格式
     * @return date
     */
    public static Date parseDate(String date, String patrern) {
        try {
            return DateUtils.parseDate(date, patrern);
        } catch (ParseException e) {
            throw new RuntimeException("Parse date error", e);
        }
    }

}
