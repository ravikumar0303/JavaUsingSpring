

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPlayer_Team {
	
	public static void main(String[] args) {
		
		 ApplicationContext act=new ClassPathXmlApplicationContext("springconfig.xml");
	
	  Team r1= (Team)act.getBean("t1");
	  System.out.println(r1);
	  ((ClassPathXmlApplicationContext)act).close();
	
	}

}
