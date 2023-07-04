package com.IET.dao;

import com.IET.beans.MyUser;

public interface LoginDao {
	
	
	MyUser validateUser(String unm, String passwd);

}
