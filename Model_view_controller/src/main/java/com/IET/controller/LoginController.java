package com.IET.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.IET.beans.MyUser;
import com.IET.service.LoginService;

@Controller
@RequestMapping("/mylogin")
public class LoginController {
	@Autowired
	LoginService loginService;

	@GetMapping("/login")
	public String showloginpage() {

		return "loginpage";
	}

	@PostMapping("/validate")
	public ModelAndView validateUser(HttpSession session, @RequestParam("uname") String unm,
			@RequestParam String passwd) {
		MyUser r1 = loginService.validateUser(unm, passwd);
		if (r1 != null) {
			session.setAttribute("emp", r1);

//			return new ModelAndView("hello", "msg", "success");
			return new ModelAndView("redirect:/product/viewProduct");
		} else {
			return new ModelAndView("loginpage", "msg", "pls reenter crendentials");
		}
	}

}
