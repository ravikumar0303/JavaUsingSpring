package com.IET.test;

import java.util.*;

import com.IET.beans.Product;
import com.IET.service.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Scanner sc = new Scanner(System.in);

		ApplicationContext apc = new ClassPathXmlApplicationContext("springconfig.xml");

		ProductService ps = (ProductService) apc.getBean("productServiceImplement");
		do {
		System.out.println(" <1>. Add new product\n <2>. Delete by id\n <3>. Display all\n <4>. Display by Id\n <5>. Sort by Id\n <6>. Modify Product\n <7>. exit\n choice: ");
		choice = sc.nextInt();
		switch (choice) {

		case 1:
					ps.AddProduct();
			break;
		case 2:
			break;
		case 3:
			List<Product> plist=ps.displayAll();
			plist.forEach(System.out::println);
			break;
					
		case 7:
			((ClassPathXmlApplicationContext) apc).close();
			break;
			
        default:
		   System.out.println("Wrong Choice !!");
		}
		}while(choice!=7);
	}
}
