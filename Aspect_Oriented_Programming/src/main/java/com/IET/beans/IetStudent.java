package com.IET.beans;

import org.springframework.stereotype.Component;

@Component
public class IetStudent {

	  public int method1() {
	    	 System.out.println("in method1");
	    	 return 117;
	     }
	     public void getData(int x) {
	    	 System.out.println("in getData");
	     }
	     public String getmydata(int x) {
	    	 System.out.println("in getmy Data"+x);
	    	 return "Ravi";
	     }

}
