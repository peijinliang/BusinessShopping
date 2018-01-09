package com.sell.dto;

import lombok.Data;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@Data
public class CartDTO {

    /**
     * 商品ID
     **/
    private String productId;

    /**
     * 数量
     **/
    private Integer productQuantity;


    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }


}
