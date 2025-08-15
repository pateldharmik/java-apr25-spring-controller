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

	public List<Product> getAllProducts(){

		return productRepo.getAllProducts();
	}
}
