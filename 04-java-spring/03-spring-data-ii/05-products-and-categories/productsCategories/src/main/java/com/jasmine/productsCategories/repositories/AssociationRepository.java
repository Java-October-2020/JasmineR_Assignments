package com.jasmine.productsCategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jasmine.productsCategories.models.Association;
@Repository
public interface AssociationRepository extends CrudRepository<Association, Long>{

}