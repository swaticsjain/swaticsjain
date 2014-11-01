package com.product.dao;

import java.util.List;

import com.product.entity.Product;



public interface ProductDao {

	Product getProduct(Integer id);
	List<Product> getProducts(Integer start,Integer count);
}
