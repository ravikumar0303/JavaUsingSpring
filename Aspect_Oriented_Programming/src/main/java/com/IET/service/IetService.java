package com.IET.service;

import org.springframework.stereotype.Service;

@Service
public class IetService {

	public int method2() {
		System.out.println("in method2");
		return 40;
	}

	public void getData(int x) {
		System.out.println("in getData");
	}

	public String getmydata(int x) {
		System.out.println("in getmy Data" + x);
		return "success";
	}
}
