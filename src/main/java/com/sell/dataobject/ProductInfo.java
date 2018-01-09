package com.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sell.enums.ProductStatusEnum;
import com.sell.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@Entity
@Data
@DynamicUpdate
public class ProductInfo implements Serializable {

    @Id
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
     * 状态: 0 正常 1 下架
     **/
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /**
     * 类目编号
     **/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }

}
