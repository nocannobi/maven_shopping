package com.po;

import java.sql.Timestamp;

public class ProductShelf extends BaseEntity{
    public static final Integer PRODUCT_SHELF_IS_STATE = 1;
    public static final Integer PRODUCT_SHELF_IS_NOT_STATE =0;

    private int id;
    private int productId;
    private Integer productShelfIsState;
    private Timestamp shelfCreateTime;
    private Timestamp shelfModifiedTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Integer getProductShelfIsState() {
        return productShelfIsState;
    }

    public void setProductShelfIsState(Integer productShelfIsState) {
        this.productShelfIsState = productShelfIsState;
    }

    public Timestamp getShelfCreateTime() {
        return shelfCreateTime;
    }

    public void setShelfCreateTime(Timestamp shelfCreateTime) {
        this.shelfCreateTime = shelfCreateTime;
    }

    public Timestamp getShelfModifiedTime() {
        return shelfModifiedTime;
    }

    public void setShelfModifiedTime(Timestamp shelfModifiedTime) {
        this.shelfModifiedTime = shelfModifiedTime;
    }

    @Override
    public String toString() {
        return "ProductShelf{" +
                "id=" + id +
                ", productId=" + productId +
                ", productShelfIsState=" + productShelfIsState +
                ", shelfCreateTime=" + shelfCreateTime +
                ", shelfModifiedTime=" + shelfModifiedTime +
                '}';
    }
}
