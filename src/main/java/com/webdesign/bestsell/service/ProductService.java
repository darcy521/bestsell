package com.webdesign.bestsell.service;

import com.webdesign.bestsell.domain.Category;
import com.webdesign.bestsell.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProduct(boolean stock);

    List<Product> getProductByUserId(int userId);

    List<Product> getProductByCategoryId(int categoryId);

    int sell(Product product);

    public List<Category> getAllCategory();
}
