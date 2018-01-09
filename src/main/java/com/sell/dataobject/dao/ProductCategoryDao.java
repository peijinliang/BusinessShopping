package com.sell.dataobject.dao;

import com.sell.dataobject.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
public class ProductCategoryDao {

    @Autowired
    private ProductCategoryMapper mapper;

    //进行增删改查的操作
    public int insertByMap(Map<String, Object> map) {
        return mapper.insertByMap(map);
    }

}
