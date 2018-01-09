package com.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sell.VO.ProductInfoVO;
import lombok.Data;

import java.util.List;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}
