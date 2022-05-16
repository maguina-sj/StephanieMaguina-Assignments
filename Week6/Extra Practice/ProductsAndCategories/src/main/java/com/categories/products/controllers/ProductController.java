package com.categories.products.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.categories.products.models.Category;
import com.categories.products.models.Product;
import com.categories.products.services.CategoryService;
import com.categories.products.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Product> products = productService.getAll();
		List<Category> categories = categoryService.getAll();
		model.addAttribute("products", products);
		model.addAttribute("categories", categories);
		return "index.jsp";
		
	}
	@GetMapping("/product/new")
	public String newProduct(@ModelAttribute("newProduct") Product product) {
		
		
		return "newProduct.jsp";
}
	@PostMapping("/product/create")
	public String createProduct(@Valid @ModelAttribute("newProduct") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}
		else {
			productService.create(product);
			return "redirect:/";
		}
	}
	@GetMapping ("/product/details/{id}")
	public String viewProduct(@PathVariable Long id, Model model) {
		Product viewProduct = productService.findOne(id);
		model.addAttribute("viewProduct", viewProduct);
		model.addAttribute("assignedCategories", categoryService.getAssignedProducts(viewProduct));
		model.addAttribute("unassignedCategories", categoryService.getUnassignedProducts(viewProduct));
		return "viewProduct.jsp";
	}
	@PostMapping("/product/details/{id}")
	public String addCategory(@PathVariable("id") Long id, @RequestParam(value="categoryId") Long catId, Model model) {
		Product product = productService.findOne(id);
		Category category = categoryService.findOne(catId);
		product.getCategories().add(category);
		productService.update(product);
		model.addAttribute("assignedCategories", categoryService.getAssignedProducts(product));
		model.addAttribute("unassignedCategories", categoryService.getUnassignedProducts(product));
		return "redirect:/product/details/" + id;
	}
}
