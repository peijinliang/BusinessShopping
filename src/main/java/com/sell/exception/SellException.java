package com.sell.exception;

import com.sell.enums.ResultEnum;
import lombok.Getter;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@Getter
public class SellException extends RuntimeException {

    private Integer code;
    private String message;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = code;
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
