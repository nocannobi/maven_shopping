package com.po;

public class ProductDetail extends BaseEntity {
    private int id;
    private Integer productId;
    private String smallImage;
    private String bigImage;
    private String productCaption;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public String getProductCaption() {
        return productCaption;
    }

    public void setProductCaption(String productCaption) {
        this.productCaption = productCaption;
    }

    @Override
    public String toString() {
        return "ProductDetail{" +
                "id=" + id +
                ", productId=" + productId +
                ", smallImage='" + smallImage + '\'' +
                ", bigImage='" + bigImage + '\'' +
                ", productCaption='" + productCaption + '\'' +
                '}';
    }
}
