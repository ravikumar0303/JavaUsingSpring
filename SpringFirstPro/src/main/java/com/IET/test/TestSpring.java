package com.IET.test;

import com.IET.beans.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestSpring {
	
	public static void main(String[] args) {
		
		//HelloWorld h=new HelloWorld();		
		//h.Hello();
		
		XmlBeanFactory bf=new XmlBeanFactory(new  ClassPathResource("springconfig.xml")) ;
          HelloWorld h=(HelloWorld)bf.getBean("h");
          h.Hello();
		
	}

}
