package Com.IET.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext act=new ClassPathXmlApplicationContext("springconfig.xml");
		
		
		Student st=(Student)act.getBean("ravi");
		System.out.println(st);
		((ClassPathXmlApplicationContext)act).close();
	}

}
