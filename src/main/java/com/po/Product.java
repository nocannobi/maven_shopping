package com.po;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Product  extends BaseEntity{
    public static final Integer PRODUCT_IS_DELETED = 1;
    public static final Integer PRODUCT_IS_NOT_DELETED = 0;

    private int id;
    private String productName;
    private BigDecimal productPrice;
    private String productType;
    private Integer productIsDeleted;
    private Timestamp productCreateTime;
    private Timestamp productModifiedTime;
    private ProductDetail productDetail;
    private ProductShelf productShelf;
    private ProductStock productStock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductIsDeleted() {
        return productIsDeleted;
    }

    public void setProductIsDeleted(Integer productIsDeleted) {
        this.productIsDeleted = productIsDeleted;
    }

    public Timestamp getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(Timestamp productCreateTime) {
        this.productCreateTime = productCreateTime;
    }

    public Timestamp getProductModifiedTime() {
        return productModifiedTime;
    }

    public void setProductModifiedTime(Timestamp productModifiedTime) {
        this.productModifiedTime = productModifiedTime;
    }




    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public ProductShelf getProductShelf() {
        return productShelf;
    }

    public void setProductShelf(ProductShelf productShelf) {
        this.productShelf = productShelf;
    }

    public ProductStock getProductStock() {
        return productStock;
    }

    public void setProductStock(ProductStock productStock) {
        this.productStock = productStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productType='" + productType + '\'' +
                ", productIsDeleted=" + productIsDeleted +
                ", productCreateTime=" + productCreateTime +
                ", productModifiedTime=" + productModifiedTime +
                ", productDetail=" + productDetail +
                ", productShelf=" + productShelf +
                ", productStock=" + productStock +
                '}';
    }
}
