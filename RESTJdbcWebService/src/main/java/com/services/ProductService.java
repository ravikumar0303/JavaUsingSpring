package com.services;

import java.util.List;

import com.beans.Product;



public interface ProductService {

	List<Product> getAllProduct();

	Product getById(int pid);

	int addProduct(Product p);

	int updateProduct(Product p);

	int deleteById(int pid);

}
