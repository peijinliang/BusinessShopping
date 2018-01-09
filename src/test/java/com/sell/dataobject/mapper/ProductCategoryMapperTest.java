package com.sell.dataobject.mapper;

import com.sell.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void insertByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("category_name", "师兄最不爱");
        map.put("category_type", 101);
        int result = mapper.insertByMap(map);
        Assert.assertEquals(1, result);
    }


    @Test
    public void insertByObject() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("marlon最爱");
        productCategory.setCategoryType(102);
        int result = mapper.insertByObject(productCategory);
        Assert.assertEquals(1, result);
    }


    @Test
    public void findByCategoryType() {
        int categoryType = 102;
        ProductCategory productCategory = mapper.findByCategoryType(categoryType);
        Assert.assertNotNull(productCategory);
    }

    @Test
    public void findByCategoryName() {
        List<ProductCategory> productCategory = mapper.findByCategoryName("师兄最不爱");
        Assert.assertNotEquals(0, productCategory.size());
    }


    @Test
    public void updateByCategoryType() {
        int result = mapper.updateByCategoryType("师兄最不爱分类", 102);
        Assert.assertNotEquals(0, result);
    }


    @Test
    public void updateByCategoryObject() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("marlon最爱");
        productCategory.setCategoryType(102);
        int result = mapper.updateByCategoryObject(productCategory);
        Assert.assertEquals(1, result);
    }


    @Test
    public void deleteByCategoryType() {
        int result = mapper.deleteByCategoryType(102);
        Assert.assertEquals(1, result);
    }


    @Test
    public void selectByCategoryType() {
        ProductCategory productCategory = mapper.selectByCategoryType(101);
        Assert.assertNotNull(productCategory);
    }

}