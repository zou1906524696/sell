package com.zzf.sell.dataobject;


import com.zzf.sell.enums.OrderStatusEnum;
import com.zzf.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
public class OrderMaster {
    /**订单Id*/
    @Id
    private String orderId;
    /**买家名字*/
    private String buyerName;
    /**买家手机号*/
    private String buyerPhone;
    /**买家地址**/
    private String buyerAddress;
    /**买家微信Openid*/
    private String buyerOpenid;
    /**订单总金额*/
    private BigDecimal orderAmount;
    /**订单状态*/
    private Integer orderStatus =OrderStatusEnum.NEW.getCode();
    /**支付状态*/
    private  Integer payStatus = PayStatusEnum.WAIT.getCode();

    /**创造时间**/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;



}
