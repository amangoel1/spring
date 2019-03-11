package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.bean.Login;
import com.cts.product.dao.LoginDAO;


@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO loginDAO;

	public String validate(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.validate(login);
	}
	
	
	

}
