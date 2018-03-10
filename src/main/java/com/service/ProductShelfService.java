package com.service;

import com.po.Product;
import com.po.ProductShelf;

public interface ProductShelfService {
    ProductShelf  findProductShelfByPid(ProductShelf productShelf);
}
