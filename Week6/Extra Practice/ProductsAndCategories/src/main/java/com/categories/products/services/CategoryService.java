package com.categories.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.categories.products.models.Category;
import com.categories.products.models.Product;
import com.categories.products.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<Category> getAll() {
		return categoryRepo.findAll();	
		}
	public Category create(Category category) {
		return categoryRepo.save(category);
	}
	public Category findOne(Long id) {
		return categoryRepo.findById(id).orElse(null);
	}
	public void delete(Long id) {
		categoryRepo.deleteById(id);
	}
	public Category update(Category category) {
		return categoryRepo.save(category);
	}
	public void addProduct(Category category, Product product) {
		List<Product> products = category.getProducts();
		products.add(product);
		categoryRepo.save(category);
	}
	public List<Category> getAssignedProducts(Product product) {
		return categoryRepo.findAllByProducts(product);
	}
	public List<Category> getUnassignedProducts(Product product) {
		return categoryRepo.findByProductsNotContains(product);
	}
}
