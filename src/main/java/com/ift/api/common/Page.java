package com.ift.api.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页返回结果
 *
 * @author liufei
 * @since 2019/8/28
 */
@Data
public class Page<T> implements Serializable {
    private static final long serialVersionUID = 7639391734133714872L;

    private int pageNo;

    private int pageSize;

    private T data;
}
