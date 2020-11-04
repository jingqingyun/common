package com.jingqingyun.common;

import java.util.List;
import java.util.Optional;

/**
 * BaseQueryApi
 *
 * @author jingqingyun
 * @date 2020/10/30
 */
public interface BaseQueryApi<T> {

    Optional<T> getById(long id);

    List<T> listByIds(List<Long> ids);

}
