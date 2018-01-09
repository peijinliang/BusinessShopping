package com.sell.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@Data
public class ProductForm {

    private String productId;

    /**
     * 名字
     **/
    private String productName;

    /**
     * 单价
     **/
    private BigDecimal productPrice;

    /**
     * 库存
     **/
    private Integer productStock;

    /**
     * 商品描述
     **/
    private String productDescription;

    /**
     * 图片(小图)
     **/
    private String productIcon;

    /**
     * 类目编号
     **/
    private Integer categoryType;


}
