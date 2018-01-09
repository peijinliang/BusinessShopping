package com.sell.service;

import com.sell.dataobject.ProductInfo;
import com.sell.dto.CartDTO;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/

public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在线商品列表
     */
    List<ProductInfo> findUpAll();

    //分页查询商品列表
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    ProductInfo onSale(String productId);
    //下架
    ProductInfo offSale(String productId);


}
