package com.jingqingyun.common.model;

import lombok.Data;

/**
 * Pager
 *
 * @author jingqingyun
 * @date 2020-09-10
 */
@Data
public class Pager {

    private Integer num;

    private Integer size;

    public Pager() {
        this.num = 1;
        this.size = 10;
    }

    public Pager(int num, int size) {
        if (num < 1 || size < 1) {
            throw new IllegalArgumentException("Pager num or size must >= 1");
        }
        this.num = num;
        this.size = size;
    }

}
