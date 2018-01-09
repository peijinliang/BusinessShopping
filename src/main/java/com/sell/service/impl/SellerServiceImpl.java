package com.sell.service.impl;

import com.sell.dataobject.SellerInfo;
import com.sell.repository.SellerInfoRepository;
import com.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }


}
