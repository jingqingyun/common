package com.jingqingyun.common.model;

import lombok.Data;

import java.util.Collections;
import java.util.List;

/**
 * Page
 *
 * @author jingqingyun
 * @date 2020-09-10
 */
@Data
public class Page<T> {

    private static final Page EMPTY = new Page();

    private List<T> data;

    private Integer total;

    @SuppressWarnings("unchecked")
    public static <T> Page<T> empty() {
        return (Page<T>) EMPTY;
    }

    public Page() {
        this.data = Collections.emptyList();
        this.total = 0;
    }

    public Page(List<T> data, int total) {
        if (data == null) {
            throw new IllegalArgumentException("Page data must not be null");
        }
        if (total < 0) {
            throw new IllegalArgumentException("Total must not < 0");
        }
        if (data.size() < total) {
            throw new IllegalArgumentException("Data size < total?");
        }
        this.data = data;
        this.total = total;
    }

}
