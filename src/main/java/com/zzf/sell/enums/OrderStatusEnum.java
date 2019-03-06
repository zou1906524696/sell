package com.zzf.sell.enums;

import lombok.Getter;

@Getter
public enum  OrderStatusEnum {

    NEW(0,"新订单"),
    FINSHED(1,"完结"),
    CANCEL(2,"已取消"),
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
