package com.sell.service;

import com.sell.dto.OrderDTO;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
public interface PushMessageService {

    void orderStatus(OrderDTO orderDTO);

}
