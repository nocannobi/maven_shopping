package com.po;


import java.sql.Timestamp;

public class ProductStock extends BaseEntity{
    private int id;
    private int productId;
    private Integer stockNumber;
    private Timestamp stockCreateTime;
    private Timestamp stockModifiedTime;

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

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Timestamp getStockCreateTime() {
        return stockCreateTime;
    }

    public void setStockCreateTime(Timestamp stockCreateTime) {
        this.stockCreateTime = stockCreateTime;
    }

    public Timestamp getStockModifiedTime() {
        return stockModifiedTime;
    }

    public void setStockModifiedTime(Timestamp stockModifiedTime) {
        this.stockModifiedTime = stockModifiedTime;
    }

    @Override
    public String toString() {
        return "ProductStock{" +
                "id=" + id +
                ", productId=" + productId +
                ", stockNumber=" + stockNumber +
                ", stockCreateTime=" + stockCreateTime +
                ", stockModifiedTime=" + stockModifiedTime +
                '}';
    }
}
