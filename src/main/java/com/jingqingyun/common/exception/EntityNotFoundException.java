package com.jingqingyun.common.exception;

/**
 * EntityNotFoundException
 *
 * @author jingqingyun
 * @date 2020/10/30
 */
public class EntityNotFoundException extends BusinessException {

    private static final long serialVersionUID = 4757886569763201541L;

    public EntityNotFoundException(String msg, long id) {
        super(msg);
    }

}
