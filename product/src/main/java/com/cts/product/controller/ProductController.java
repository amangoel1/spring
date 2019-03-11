package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.bean.Login;
import com.cts.product.bean.Product;

@Controller
public class ProductController {
	
	@RequestMapping("addProduct.html")
	public String getLoginPage()
	{
		return "addProduct";
	}
	
	

}
