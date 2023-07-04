package com.IET.service;

import com.IET.beans.MyUser;

public interface LoginService {
	
	MyUser validateUser(String unm,String passwd);
	

}
