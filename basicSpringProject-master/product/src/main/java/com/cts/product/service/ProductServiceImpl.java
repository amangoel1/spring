package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.bean.Product;
import com.cts.product.dao.ProductDAO;
//import com.cts.product.dao.ProductDAOImpl;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDAO productDAO;

	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product findProduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteProduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> filterProducts(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
