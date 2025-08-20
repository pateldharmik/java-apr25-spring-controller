package org.example.javaapr25springcontroller.service;

import org.example.javaapr25springcontroller.entity.Product;
import org.example.javaapr25springcontroller.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
	@Autowired
	ProductRepo productRepo;

	//Get all products
	public List<Product> getAllProducts(){

		return productRepo.getAllProducts();
	}

	//Get product by ID
	public Product getProductById(int id){
		return productRepo.getProductWithBeanPropertyRM(id);
	}

	//Add a product
	public void addProduct(Product product){
		productRepo.addProduct(product);
	}

	//Update a product
	public void updateProduct(int id, Product product){
		productRepo.updateProduct(id,product);
	}

	//Delete a product
	public void deleteProduct(int id){
		productRepo.deleteProduct(id);
	}
}
