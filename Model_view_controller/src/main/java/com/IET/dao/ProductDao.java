package com.IET.dao;

import java.util.List;

import com.IET.beans.Product;

public interface ProductDao {

	List<Product> FinadAllProduct();

	int save(Product p);

}
