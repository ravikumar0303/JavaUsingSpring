package com.IET.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IET.beans.MyUser;
import com.IET.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;

	public MyUser validateUser(String unm, String passwd) {
		// TODO Auto-generated method stub
		return loginDao.validateUser(unm, passwd);
	}
	
	
}
