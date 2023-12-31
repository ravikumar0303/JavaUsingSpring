package com.IET.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("114")
	private int sid;
	@Value("pankaj")
	private String sname;
	@Autowired
	private Address addr;
	
	public Student() {
		super();
	}

	public Student(int sid, String sname, Address addr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.addr = addr;
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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", addr=" + addr + "]";
	}

}
