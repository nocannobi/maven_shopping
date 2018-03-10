package com.dao;

import com.po.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductDao {
    boolean addProduct(Product product);
    boolean delProduct(Product product);
    boolean updateProduct(Product product);
    Product queryProductByName(Product product);
    List<Product> queryAllProduct();
    Product queryProduct(String productName, int id);
    Product queryProductById(Product product);
}
