package com.jingqingyun.common.exception;

/**
 * BusinessException
 *
 * @author jingqingyun
 * @date 2020-09-10
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 3579059025097752749L;

    public BusinessException(String msg) {
        super(msg);
    }

}
