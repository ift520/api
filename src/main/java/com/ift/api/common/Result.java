package com.ift.api.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一前后端数据交互格式
 *
 * @author liufei
 * @since 2019/8/28
 */
@Data
public class Result implements Serializable {
    private static final long serialVersionUID = 6219926425630601499L;

    private int code;

    private String msg;

    private Object data;

    private Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result isSuccess(String msg) {
        return new Result(200, msg);
    }

    public static Result isSuccess(String msg, Object data) {
        return new Result(200, msg, data);
    }

    public static Result isFailure(String msg) {
        return new Result(500, msg);
    }

    public static Result isFailure(String msg, Object data) {
        return new Result(500, msg, data);
    }
}
