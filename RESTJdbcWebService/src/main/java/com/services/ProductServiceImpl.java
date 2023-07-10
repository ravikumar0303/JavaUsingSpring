package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.beans.Product;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
     private ProductDao productDao;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		return productDao.findById(pid);
	}

	@Override
	public int addProduct(Product p) {
		// TODO Auto-generated method stub
		return productDao.save(p);
	}

	@Override
	public int updateProduct(Product p) {
		// TODO Auto-generated method stub
		return productDao.modifyProduct(p);
	}

	@Override
	public int deleteById(int pid) {
		// TODO Auto-generated method stub
		return productDao.removeById(pid);
	}

 
}
