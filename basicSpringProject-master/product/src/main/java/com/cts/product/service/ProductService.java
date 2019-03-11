package com.cts.product.service;

import java.util.List;

import com.cts.product.bean.Product;

public interface ProductService {
	public String addProduct(Product product);
	public List<Product> getAllProducts();
	public Product findProduct(String id);
	public String deleteProduct(String productId);
	public List<Product> filterProducts(String query);
}
