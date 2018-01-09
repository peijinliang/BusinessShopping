package com.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@Data
public class CategoryForm {

    private Integer categoryId;

    /**
     * 类目名称
     */
    @NotEmpty(message = "类目姓名必填")
    private String categoryName;

    /**
     * 类目编号
     */
    @NotEmpty(message = "类目编号必填")
    private Integer categoryType;

}
