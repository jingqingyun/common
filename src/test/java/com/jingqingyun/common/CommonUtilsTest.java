package com.jingqingyun.common;

import com.jingqingyun.common.utils.CommonUtils;
import org.junit.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;

/**
 * CommonUtilsTest
 *
 * @author jingqingyun
 * @date 2020/11/9
 */
public class CommonUtilsTest {

    @Test
    public void test1() {
        float val = 0.599f;
        System.out.println(CommonUtils.percent(val, 2));
        System.out.printf("%tQ\n", Instant.now());
        System.out.printf("%tQ\n", LocalDateTime.now().atZone(ZoneId.systemDefault()));
    }

    @Test
    public void testArray() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Integer[] array = new Integer[3];
        Integer[] array2 = list.toArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }

    @Test
    public void testChar() {
        String name = "name";
        System.out.println('%' + name + '%');
    }

}
