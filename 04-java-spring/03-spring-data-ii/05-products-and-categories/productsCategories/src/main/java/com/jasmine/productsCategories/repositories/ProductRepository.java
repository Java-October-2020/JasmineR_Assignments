package com.jasmine.productsCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jasmine.productsCategories.models.Category;
import com.jasmine.productsCategories.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}