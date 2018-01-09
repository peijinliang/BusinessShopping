package com.sell.controller;

import com.sell.service.SecKillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@RestController
@RequestMapping("/skill")
@Slf4j
public class SeckKillController {

    @Autowired
    private SecKillService secKillService;


    /**
     * 秒杀活动查询特价商品的信息
     *
     * @param productId
     * @return
     * @throws Exception
     */
    @GetMapping("/query/{productId}")
    public String query(@PathVariable String productId) throws Exception {
        return secKillService.querySeckillProductInfo(productId);
    }


    /**
     * 秒杀,没有抢到获得 哎呦 抢到了会返回剩余库存的数量
     * @param productId
     * @return
     */
    @GetMapping("/order/{productId}")
    public String skill(@PathVariable String productId) throws Exception {
        log.info("@skill request ,productId:" + productId);
        secKillService.orderProductMockDiffUser(productId);
        return secKillService.querySeckillProductInfo(productId);
    }


}
