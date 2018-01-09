package com.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@Data
@Entity
public class OrderDetail {

    @Id
    private String detailId;

    /**
     * 订单ID
     **/
    private String orderId;


    /**
     * 商品Id
     **/
    private String productId;

    /**
     * 商品名称
     **/
    private String productName;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;


    /**
     * 商品数量
     */
    private Integer productQuantity;

    /**
     * 商品小图
     */
    private String productIcon;


}
