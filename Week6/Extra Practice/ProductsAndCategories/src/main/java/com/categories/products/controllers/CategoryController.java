package com.categories.products.controllers;

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
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/category/new")
	public String newCategory(@ModelAttribute("newCategory") Category category)
	{
		return "newCategory.jsp";
	}
	@PostMapping("/category/create")
	public String createCategory(@Valid @ModelAttribute("newCategory") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}
		else {
			categoryService.create(category);
			return "redirect:/";
		}
	}
	@GetMapping("/categories/details/{id}")
	public String showCategory(@PathVariable("id") Long id, Model model) {
		Category category = categoryService.findOne(id);
		model.addAttribute("assignedProducts", productService.findAssignedCategories(category));
		model.addAttribute("unassignedProducts", productService.findUnassignedCategories(category));
		model.addAttribute("category", categoryService.findOne(id));
		return "viewCategory.jsp";
	}
	
	@PostMapping("/categories/details/{id}")
	public String editCategory(@PathVariable("id") Long id, @RequestParam(value="productId") Long productId, Model model) {
		Category category = categoryService.findOne(id);
		Product product = productService.findOne(productId);
		category.getProducts().add(product);
		categoryService.update(category);
		model.addAttribute("assignedProducts", productService.findAssignedCategories(category));
		model.addAttribute("unassignedProducts", productService.findUnassignedCategories(category));
		return "redirect:/categories/details/" + id;
	}
	
}
