package com.jasmine.productsCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jasmine.productsCategories.models.Category;
import com.jasmine.productsCategories.models.Product;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
}