package com.sell.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@Data
public class ResultVO<T> implements Serializable {

    /**
     * 错误码
     **/
    private Integer code;

    /**
     * 错误信息
     **/
    private String msg;

    private T data;


}
