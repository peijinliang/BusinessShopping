package com.sell.repository;

import com.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/

public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {

    SellerInfo findByOpenid(String openid);

}
