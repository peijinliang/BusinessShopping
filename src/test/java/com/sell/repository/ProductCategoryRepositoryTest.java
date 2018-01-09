package com.sell.repository;

import com.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
//    @Transactional  //测试里边的service  你做完操作之后他会自定进行回滚
    public void saveTest() {
        List<Integer> list = Arrays.asList(2);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
//        System.out.println("---------------：" + result.toString());
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        List<ProductCategory> listCategory = repository.findByCategoryTypeIn(list);
//        ProductCategory productCategory = new ProductCategory("小朋友最爱", 7);
//        ProductCategory result = repository.save(productCategory);
//        Assert.assertNotNull(result);
//        Assert.assertEquals(null, result);
        System.out.println(result.toString());
    }


    @Test

    public void updateTest() {
        ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }


}