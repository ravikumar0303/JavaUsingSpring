package com.IET.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.IET.beans.MyUser;
@Repository
public class LogitDaoImpl implements LoginDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
     
	public MyUser validateUser(String unm, String passwd) {
		try {
		
	
	return jdbcTemplate.queryForObject("select * from emp where uname=? and password=?",new Object []{unm,passwd},BeanPropertyRowMapper.newInstance(MyUser.class));
    }catch(EmptyResultDataAccessException jermi) {
	  return null;
     }	

}

}
