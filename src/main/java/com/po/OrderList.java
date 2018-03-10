package com.po;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public class OrderList extends BaseEntity{
    public static final Integer ORDER_IS_PAY= 1;
    public static final Integer ORDER_IS_NOT_PAY = 0;
    public static final Integer ORDER_IS_DELETES = 1;
    public static final Integer ORDER_IS_NOT_DELETE = 0;
    public static final Integer ORDER_IS_TRANSPORT =1;
    public static final Integer ORDER_IS_NOT_TRANSPORT =0;
    public static final Integer ORDER_IS_ALREADY_TRANSPORT =2;

    private int id;
    private Integer customerId;
    private BigDecimal totalMoney;
    private Integer orderIsPay;
    private Integer orderIsDelete;
    private Integer orderIsTransport;
    private Timestamp orderCreateTime;
    private Timestamp orderModifiedTime;
    private List<OrderItem> orderItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getOrderIsPay() {
        return orderIsPay;
    }

    public void setOrderIsPay(Integer orderIsPay) {
        this.orderIsPay = orderIsPay;
    }

    public Integer getOrderIsDelete() {
        return orderIsDelete;
    }

    public void setOrderIsDelete(Integer orderIsDeletes) {
        this.orderIsDelete = orderIsDelete;
    }

    public Integer getOrderIsTransport() {
        return orderIsTransport;
    }

    public void setOrderIsTransport(Integer orderIsTransport) {
        this.orderIsTransport = orderIsTransport;
    }

    public Timestamp getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Timestamp orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Timestamp getOrderModifiedTime() {
        return orderModifiedTime;
    }

    public void setOrderModifiedTime(Timestamp orderModifiedTime) {
        this.orderModifiedTime = orderModifiedTime;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", totalMoney=" + totalMoney +
                ", orderIsPay=" + orderIsPay +
                ", orderIsDelete=" + orderIsDelete +
                ", orderIsTransport=" + orderIsTransport +
                ", orderCreateTime=" + orderCreateTime +
                ", orderModifiedTime=" + orderModifiedTime +
                '}';
    }
}
