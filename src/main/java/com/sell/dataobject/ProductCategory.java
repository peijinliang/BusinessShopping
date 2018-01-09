package com.sell.dataobject;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/

//@Table(name = "product_category")
@Entity
@DynamicUpdate  //进行更新
@Data
//包含了生成GET 和 Set  toString 方法
public class ProductCategory {

    /**
     * 类目Id
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;


    private Date createTime;

    private Date updateTime;


    public ProductCategory() {

    }


    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}
