package com.cognizant.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	int productId;
	@Column(name="product_name")
	String productName;
	@Column(name="dom")
	String dom;
	@Column(name="price")
	double price;
	public Product() 
	{
	}
	public Product(String productName, String dom, double price) 
	{
		this.productName = productName;
		this.dom = dom;
		this.price = price;
	}
	public int getProductId() 
	{
		return productId;
	}
	public void setProductId(int productId) 
	{
		this.productId = productId;
	}
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	public String getDom() 
	{
		return dom;
	}
	public void setDom(String dom) 
	{
		this.dom = dom;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", dom=" + dom + ", price=" + price
				+ "]";
	}
	
	
}
