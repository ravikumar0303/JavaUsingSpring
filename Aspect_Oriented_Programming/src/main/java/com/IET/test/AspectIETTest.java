package com.IET.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.IET.beans.*;
import com.IET.service.*;
public class AspectIETTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext act=new ClassPathXmlApplicationContext("springconfig.xml");
		
		IetStudent st=(IetStudent)act.getBean("ietStudent");
		st.method1();
//		st.getData(117);
		
		IetService is=(IetService)act.getBean("ietService");
		is.method2();
		
//		MyClass c1=(MyClass)act.getBean("myClass");
//		c1.method1();
	

	}

}
