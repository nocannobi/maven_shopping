package com.service;

import com.po.Product;
import com.po.ProductStock;

public interface ProductStockService {
    ProductStock findProductStockByPid(ProductStock productStock);
}
