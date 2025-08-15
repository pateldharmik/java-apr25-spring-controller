package org.example.javaapr25springcontroller.controller;

import org.example.javaapr25springcontroller.entity.Product;
import org.example.javaapr25springcontroller.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/getAll")
	public List<Product> getProducts() {
		return productService.getAllProducts();
	}
}
