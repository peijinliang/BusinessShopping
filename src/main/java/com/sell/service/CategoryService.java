package com.sell.service;

import com.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
public interface CategoryService {


    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);

    ProductCategory save(ProductCategory productCategory);


}
