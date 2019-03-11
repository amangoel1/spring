package com.cts.product.configuration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cts.product.bean.Login;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value={@ComponentScan("com.cts.product.dao"),
		@ComponentScan("com.cts.product.service")})
public class AppConfig {
	@Autowired
	private Environment environment;
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		Properties properties = new Properties();
		properties.put(org.hibernate.cfg.Environment.DRIVER, environment.getProperty("mysql.driver"));
		properties.put(org.hibernate.cfg.Environment.URL,environment.getProperty("mysql.url"));
		properties.put(org.hibernate.cfg.Environment.USER,environment.getProperty("mysql.user"));
		properties.put(org.hibernate.cfg.Environment.PASS,environment.getProperty("mysqlpassword"));
		
		//hibernate settings
		
		properties.put(org.hibernate.cfg.Environment.SHOW_SQL,environment.getProperty("hibernate.show_sql"));
		properties.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO,environment.getProperty("hibernate.hbm2ddl.auto"));
		
		sessionFactoryBean.setHibernateProperties(properties);
		sessionFactoryBean.setAnnotatedClasses(Login.class);
		
		return sessionFactoryBean;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager()
	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
		
	}
	
	
	
}
