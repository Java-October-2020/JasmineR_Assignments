package com.jasmine.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jasmine.languages.models.Languages;
import com.jasmine.languages.repositories.LanguagesRepository;

@Service
	public class LanguagesService {
	    private final LanguagesRepository langRepo;
	    public LanguagesService(LanguagesRepository repo) {
	        langRepo = repo;
	    }

	    public List<Languages> allLanguages() {
	        return langRepo.findAll();
	    }

	    public Languages findLanguage(Long id) {
	        return langRepo.findById(id).orElse(null);
	    }
	    public Languages createLanguage(Languages lang) {
	        return langRepo.save(lang);
	    }

	    public Languages updateLanguage(Languages lang) {
	        return langRepo.save(lang);
	    }

	    public void deleteLanguage(Long id) {
	        langRepo.deleteById(id);
	    }
	}
