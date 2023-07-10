package com.dao;

import java.util.List;

import com.beans.Product;


public interface ProductDao {

	List<Product> findAll();

	Product findById(int pid);

	int save(Product p);

	int modifyProduct(Product p);

	int removeById(int pid);

}
