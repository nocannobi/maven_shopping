package com.po;

import java.sql.Timestamp;

public class OrderItem extends BaseEntity{
    private int id;
    private Integer orderListId;
    private Integer productId;
    private Integer productNumber;
    private Timestamp itemCreateTime;
    private Timestamp itemModifiedTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getOrderListId() {
        return orderListId;
    }

    public void setOrderListId(Integer orderListId) {
        this.orderListId = orderListId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Timestamp getItemCreateTime() {
        return itemCreateTime;
    }

    public void setItemCreateTime(Timestamp itemCreateTime) {
        this.itemCreateTime = itemCreateTime;
    }

    public Timestamp getItemModifiedTime() {
        return itemModifiedTime;
    }

    public void setItemModifiedTime(Timestamp itemModifiedTime) {
        this.itemModifiedTime = itemModifiedTime;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orderListId=" + orderListId +
                ", productId=" + productId +
                ", productNumber=" + productNumber +
                ", itemCreateTime=" + itemCreateTime +
                ", itemModifiedTime=" + itemModifiedTime +
                '}';
    }
}
