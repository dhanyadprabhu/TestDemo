package com.cognizant.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.project.entity.Product;
@Repository
public class ProductDAOImpl implements ProductDAO 
{
	@Autowired
	private SessionFactory factory;
	@Override
	@Transactional
	public List<Product> getAllProducts() 
	{
		Session session=factory.getCurrentSession();
		Query<Product> query=session.createQuery("from Product",Product.class);
		List<Product> listOfProducts=query.getResultList();
		listOfProducts.forEach(c->System.out.println(c));
		return listOfProducts;
	}
	@Override
	public void saveProduct(Product theProduct) 
	{
		Session session=factory.getCurrentSession();
		//session.save(theProduct);
		session.saveOrUpdate(theProduct);
	}
	@Override
	public Product getProduct(int theProductId) 
	{
		Session session=factory.getCurrentSession();
		Product product=session.get(Product.class,theProductId);
		return product;
	}
	@Override
	public void deleteProduct(int theProductId) 
	{
		Session session=factory.getCurrentSession();
		Query theQuery=session.createQuery("delete from Product where productId=:theProId");
		theQuery.setParameter("theProId",theProductId);
		theQuery.executeUpdate();
		System.out.println("delete method is called");
	}

}
