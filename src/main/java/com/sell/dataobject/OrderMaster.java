package com.sell.dataobject;

import com.sell.enums.OrderStatusEnum;
import com.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/

@Entity
@DynamicUpdate
@Data
public class OrderMaster {

    /**
     * 订单Id
     **/
    @Id
    private String orderId;

    /**
     * 买家的名字
     **/
    private String buyerName;

    /**
     * 买家的手机号
     **/
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信OpenId
     */
    private String buyerOpenid;

    /**
     * 订单金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态 默认为新下的订单
     */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /**
     * 支付方式  默认0为未支付
     **/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    //在数据中对应的时候就不再去找这个字段
//    @Transient
//    private List<OrderDetail> orderDetails;


}
