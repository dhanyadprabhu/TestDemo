package com.cognizant.project.Service;

import java.util.List;

import com.cognizant.project.entity.Product;

public interface ProductService 
{
	public List<Product> getAllProducts();

	public void saveProduct(Product theProduct);

	public Product getProduct(int theProductId);

	public void deleteProduct(int theProductId);
}
