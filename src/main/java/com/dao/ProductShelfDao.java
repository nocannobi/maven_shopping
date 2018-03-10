package com.dao;

import com.po.Product;
import com.po.ProductShelf;

public interface ProductShelfDao {

    ProductShelf findProductShelfByPid(ProductShelf productShelf);
}
