package com.jasmine.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.jasmine.languages.models.Languages;

public interface LanguagesRepository extends CrudRepository<Languages, Long>{
	List<Languages> findAll();
}

