package com.zzf.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;
    /**订单Id*/
    private String orderId;
    /**商品Id*/
    private String productId;
    /**商品名字*/
    private String productName;
    /**商品单价*/
    private BigDecimal productPrice;
    /**商品数量*/
    private Integer productQuantity;
    /***商品小图*/
    private String productIcon;
}
