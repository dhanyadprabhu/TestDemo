package com.cognizant.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.project.Service.ProductService;
import com.cognizant.project.entity.Product;

@Controller
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	ProductService productService;
	@GetMapping("/listproduct")
	public String listAllProducts(Model theModel)
	{
		List<Product> products=productService.getAllProducts();
		theModel.addAttribute("products",products);
		System.out.println(products);
		return "product-list";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		Product product=new Product();
		theModel.addAttribute("product",product);
		return "product-form";
	}
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product theProduct)
	{
		productService.saveProduct(theProduct);
		return "redirect:/product/listproduct";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("productId") int theProductId,Model theModel)
	{
		Product theProduct=productService.getProduct(theProductId);
		theModel.addAttribute("product",theProduct);
		return "product-form";
	}
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("productId") int theProductId)
	{
		productService.deleteProduct(theProductId);
		return "redirect:/product/listproduct";
	}
}
