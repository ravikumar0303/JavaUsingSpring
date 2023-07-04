package com.IET.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IET.beans.Product;
import com.IET.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
    
	@Autowired
	ProductDao pdao;
	


	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pdao.FinadAllProduct();
	}



	@Override
	public void addNewProduct(Product p) {
		// TODO Auto-generated method stub
		pdao.save(p);
	}

}
