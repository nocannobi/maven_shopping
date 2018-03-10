package com.dao;

import com.po.Product;
import com.po.ProductDetail;

public interface ProductDetailDao {
    ProductDetail findProductDetailById(ProductDetail productDetail);
    ProductDetail findProductDetailByPid(ProductDetail productDetail);
}
