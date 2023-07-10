package com.IET.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.IET.beans.Product;


@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
     @Override
	public List<Product> FinadAllProduct() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from product" ,(rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getFloat(3));
			p.setQty(rs.getInt(4));
			return p;
		});
	}


	@Override
	public int save(Product p) {
		// TODO Auto-generated method stub
		
		return jdbcTemplate.update("insert into product values(?,?,?,?)",new Object[] {
				p.getPid(),p.getPname(),p.getQty(),p.getPrice()});
		
	}

}
