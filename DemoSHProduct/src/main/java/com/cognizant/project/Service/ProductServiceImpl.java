package com.cognizant.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.project.dao.ProductDAO;
import com.cognizant.project.entity.Product;
@Service
public class ProductServiceImpl implements ProductService 
{
	@Autowired
	ProductDAO productDao;
	@Override
	@Transactional
	public List<Product> getAllProducts() 
	{
		return productDao.getAllProducts();
	}
	@Override
	@Transactional
	public void saveProduct(Product theProduct) 
	{
		productDao.saveProduct(theProduct);
		
	}
	@Override
	@Transactional
	public Product getProduct(int theProductId) 
	{
		return productDao.getProduct(theProductId);
	}
	@Override
	@Transactional
	public void deleteProduct(int theProductId) 
	{
		productDao.deleteProduct(theProductId);
	}

}
