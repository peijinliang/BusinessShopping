package com.sell.service;

import com.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

}
