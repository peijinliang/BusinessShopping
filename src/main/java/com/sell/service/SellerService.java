package com.sell.service;

import com.sell.dataobject.SellerInfo;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/


public interface SellerService {

    SellerInfo findSellerInfoByOpenid(String openid);
}
