package org.example.javaapr25springcontroller.controller;

import org.example.javaapr25springcontroller.entity.Product;
import org.example.javaapr25springcontroller.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping("/getID/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}

	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		productService.addProduct(product);
		return product;
	}

	@PutMapping("/{id}")
	public Product updateProduct(@RequestBody Product product, @PathVariable int id) {
		productService.updateProduct(id,product);
		return product;
	}

	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
		return "Product deleted successfully!!!";
	}
}
