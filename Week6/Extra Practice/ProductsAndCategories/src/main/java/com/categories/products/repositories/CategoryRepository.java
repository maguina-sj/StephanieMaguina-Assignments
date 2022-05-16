package com.categories.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.categories.products.models.Category;
import com.categories.products.models.Product;


@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {
	//get all categories
	List<Category> findAll();
	List<Category> findAllByProducts(Product product);
	List<Category> findByProductsNotContains(Product product);

}
