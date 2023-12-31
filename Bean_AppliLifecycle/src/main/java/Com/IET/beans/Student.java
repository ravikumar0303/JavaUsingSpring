package Com.IET.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,DisposableBean{
	private int sid;
	private String sname;
	private String city;

	public Student() {
		super();
	}

	public Student(int sid, String sname, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In destroy method");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("in setapplicationcontextaware method");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("in setBeanFactory"+beanFactory.toString());
		
		
	}

	public void myinit() {
		System.out.println("in myinit method");
	}
	public void mydestroy() {
		System.out.println("in mydestroy method");
	}	
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("in setBean name"+name);
		
	}

}
