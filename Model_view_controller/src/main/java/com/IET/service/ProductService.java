package com.IET.service;

import java.util.List;

import com.IET.beans.Product;

public interface ProductService {

	

	List<Product> getAllProduct();

	void addNewProduct(Product p);
	

}
