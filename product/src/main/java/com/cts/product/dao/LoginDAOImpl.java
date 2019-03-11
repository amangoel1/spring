package com.cts.product.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.bean.Login;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public String validate(Login login) {
		
		Session session = sessionFactory.getCurrentSession();
		String query = "from login where userName= ? and password = ?";
		
		org.hibernate.query.Query<Login> query2= null;
		
		query2= session.createQuery(query);
		query2.setParameter(0,login.getUserName());
		query2.setParameter(1,login.getPassword());
		
		Login user= query2.getSingleResult();
		
		return "success";
		
		
		// TODO Auto-generated method stub
		
	}

}
