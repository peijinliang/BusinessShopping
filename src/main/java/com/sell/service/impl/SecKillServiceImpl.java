package com.sell.service.impl;

import com.sell.exception.SellException;
import com.sell.service.RedisLock;
import com.sell.service.SecKillService;
import com.sell.utils.KeyUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 * 秒杀互动
 **/

@Service
@Slf4j
public class SecKillServiceImpl implements SecKillService {


    private static final int TIMEOUT = 10 * 1000; //超时时间10s

    @Autowired
    private RedisLock redisLock;

    /**
     * 国庆活动，皮蛋瘦肉粥特价 限量10000份
     */
    static Map<String, Integer> products;
    static Map<String, Integer> stock;
    static Map<String, String> orders;

    static {
        /**
         * 模拟多个表,商品信息表，库存表，秒杀成功订单表
         */
        products = new HashMap<>();
        stock = new HashMap<>();
        orders = new HashMap<>();

        products.put("123456", 100000);
        stock.put("123456", 100000);
    }

    private String queryMap(String productId) {
        return "国庆节活动,皮蛋瘦肉粥特价，限量"
                       + products.get(productId)
                       + "还剩:" + stock.get(productId) + "份"
                       + "该商品成功下单用户数目:"
                       + orders.size() + "人";
    }

    @Override
    public String querySeckillProductInfo(String productId) {
        return this.queryMap(productId);
    }

    //synchronized  加锁进行处理  1.无法做到细粒度（单个商品） 2.耗时太长  3.无法做到负载均衡 分布式
    //多个机器 多个进程 对一个数据进行操作的互斥
    @Override
    public void orderProductMockDiffUser(String productId) {
        //加锁
        long time = System.currentTimeMillis() + TIMEOUT;
        if (!redisLock.lock(productId, String.valueOf(time))) {
            throw new SellException(101, "哎呦喂,人也太多了,换个姿势再试试");
        }

        //1.0查询该商品库存，为0时活动结束
        int stockNum = stock.get(productId);
        if (stockNum == 0) {
            throw new SellException(100, "活动结束");
        } else {
            //下单(模拟不同的用户 openid不同)
            orders.put(KeyUtil.genUniqueKey(), productId);
            //减库存
            stockNum = stockNum - 1;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stock.put(productId, stockNum);
        }
        //解锁
        redisLock.unlock(productId, String.valueOf(time));
    }

}
