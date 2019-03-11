package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.bean.Login;

@Controller
public class LoginController {
	
	@RequestMapping("login.html")
	public String getLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="login.html",method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Login login)
	{
		ModelAndView modelAndView = new ModelAndView();
		
		if("admin".equals(login.getUserName()) && "admin".equals(login.getPassword()))
				{
					modelAndView.setViewName("admin");
					
			
				}
		
		else
			modelAndView.setViewName("login");
		
		return modelAndView;
			
	}
	
	
	

}
