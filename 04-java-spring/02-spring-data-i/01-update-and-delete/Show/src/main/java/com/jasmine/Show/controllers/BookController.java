package com.jasmine.Show.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasmine.Show.models.Book;
import com.jasmine.Show.services.BookService;

@RestController

public class BookController {
	private BookService bService;
	
	public BookController(BookService service) {
		this. bService = service;
	}
	@GetMapping("/")
	public List<Book> index(){
		return this.bService.getAllBooks();
	}
	@GetMapping("{id}")
	public Book getShow(@PathVariable("id")Long id) {
		return this.bService.getOneBook(id);
	}
	@PutMapping("/Book/update/{id}")
	public Book edit(@PathVariable("id")Long id, Book updatedBook) {
		return this.bService.updateBook(updatedBook);
	}
	@PostMapping("/")
	public Book Create(Book newBook) {
		return this.bService.updateBook(newBook);
	}
	@DeleteMapping("/Book/delete/{id}")
	public void removeBook(@PathVariable("id")Long id) {
		this. bService.deleteBook(id);
	}
	
}
