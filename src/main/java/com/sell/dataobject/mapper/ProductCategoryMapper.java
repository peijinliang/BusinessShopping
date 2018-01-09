package com.sell.dataobject.mapper;


import com.sell.dataobject.ProductCategory;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
public interface ProductCategoryMapper {

    @Insert("insert into product_category (category_name ,category_type}) values (#{category_name,jdbcType=VARCHAR},#{category_type,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);

    @Insert("insert into product_category (category_name ,category_type}) values (#{category_name,jdbcType=VARCHAR},#{category_type,jdbcType=INTEGER})")
    int insertByObject(ProductCategory productCategory);


    @Select("select * from product_category where  category_type = #{categoryType}")
    @Results({
                     @Result(column = "category_type", property = "categoryType"),
                     @Result(column = "category_id", property = "categoryId"),
                     @Result(column = "category_name", property = "categoryName")
    })
    ProductCategory findByCategoryType(Integer categoryType);


    @Select("select * from product_category where  category_name = #{categoryName}")
    @Results({
                     @Result(column = "category_type", property = "categoryType"),
                     @Result(column = "category_id", property = "categoryId"),
                     @Result(column = "category_name", property = "categoryName")
    })
    List<ProductCategory> findByCategoryName(String categoryName);

    @Update("update product_category set category_name = #{categoryName} where category_type = #{categoryType}")
    int updateByCategoryType(@Param("categoryName") String categoryName,
                             @Param("categoryType") Integer categoryType);

    @Update("update product_category set category_name = #{categoryName} where category_type = #{categoryType}")
    int updateByCategoryObject(ProductCategory productCategory);


    @Delete("delete from product_category where  category_type = #{categoryType}")
    int deleteByCategoryType(Integer categoryType);


    /**
     * 在xml文件中配置了该方法  然后里边写了他的查询语句以及实现的方法 (关联) 用来进行测试
     * 启动类进行配置
     * @param categoryType
     * @return
     */
    ProductCategory selectByCategoryType(Integer categoryType);


}
