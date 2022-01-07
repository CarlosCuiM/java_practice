package org.example.dao;

import org.example.pojo.Product;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    void addProduct(Product product);
    List<Product> getProductList();
    void updateProductPrice(Map<String,Object> map);
}

//int a ,b