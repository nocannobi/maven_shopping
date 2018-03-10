package com.dao;

import com.po.Product;
import com.po.ProductStock;

public interface ProductStockDao {
    ProductStock findProductStockByPid(ProductStock productStock);
}
