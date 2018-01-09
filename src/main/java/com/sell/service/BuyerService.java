package com.sell.service;

import com.sell.dto.OrderDTO;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消一个订单
    OrderDTO cancelOrder(String openid, String orderId);

}
