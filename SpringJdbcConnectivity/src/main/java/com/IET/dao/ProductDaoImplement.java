package com.IET.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.IET.beans.Product;

@Repository
public class ProductDaoImplement implements ProductDao{
	
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(Product p) {
		// TODO Auto-generated method stub
		int n=jdbcTemplate.update("insert into product values(?,?,?,?)",new Object [] {
				p.getPid(),p.getPname(),p.getQty(),p.getPrice()
		});	
	}

	@Override
	public List<Product> FindAll() {
		// TODO Auto-generated method stub
		
		List<Product> plist=jdbcTemplet.query("SElect * from product")
		return null;
	}

}
