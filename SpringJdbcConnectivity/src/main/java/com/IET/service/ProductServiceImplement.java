package com.IET.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IET.dao.ProductDao;
import java.util.*;
import com.IET.beans.*;
@Service
public class ProductServiceImplement implements ProductService {
	@Autowired
	private ProductDao pdao;

	@Override
	public void AddProduct() {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid");
		int pid=sc.nextInt();
		System.out.println("Enter pname:");
		String pname=sc.next();
		System.out.println("Enter Qty");
		int qty=sc.nextInt();
		System.out.println("Enter Price:");
		float price=sc.nextFloat();
		
		Product p=new Product(pid,pname,qty,price);
		pdao.save(p);
	}

	@Override
	public List<Product> displayAll() {
		// TODO Auto-generated method stub
		return pdao.FindAll();
	}

}
