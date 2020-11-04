package com.jingqingyun.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Error
 *
 * @author jingqingyun
 * @date 2020/11/3
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseError {

    private Integer code = 0;

    private String msg;

}
