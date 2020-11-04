package com.jingqingyun.common.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Response
 *
 * @author jingqingyun
 * @date 2020-09-10
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Response<T> extends ResponseError {

    private static final Response<?> OK = new Response<>();

    private T data;

    public Response() {
        super();
    }

    private Response(Integer code, T data, String msg) {
        super(code, msg);
        this.data = data;
    }

    @SuppressWarnings("unchecked")
    public static <T> Response<T> ok() {
        return (Response<T>) OK;
    }

    public static <T> Response<T> ok(T data) {
        return new Response<>(0, data, null);
    }

    public static <T> Response<T> error(String msg) {
        return new Response<>(1, null, msg);
    }

    public static <T> Response<T> error(int code, String msg) {
        if (code == 0) {
            throw new IllegalArgumentException("0 is not error code");
        }
        return new Response<>(code, null, msg);
    }

    public boolean isSucceed() {
        return getCode() == 0;
    }

    public boolean isFailed() {
        return getCode() != 0;
    }

}
