package com.categories.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.categories.products.models.Category;
import com.categories.products.models.Product;
import com.categories.products.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> getAll() {
		return productRepo.findAll();
	}
	public Product create(Product product) {
		return productRepo.save(product);
	}
	public Product findOne(Long id) {
		return productRepo.findById(id).orElse(null);
	}
	public void delete(Long id) {
		productRepo.deleteById(id);
	}
	public List<Product> findAssignedCategories(Category category) {
		return productRepo.findAllByCategories(category);
	}
	public List<Product> findUnassignedCategories(Category category) {
		return productRepo.findByCategoriesNotContains(category);
	}
	public Product update(Product product) {
		return productRepo.save(product);
	}
}