package com.jasmine.Show.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jasmine.Show.models.Book;
import com.jasmine.Show.repositories.BookRepository;

@Service

public class BookService {
	private BookRepository bRepo;

	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}

	public List<Book> getAllBooks() {
		return this.bRepo.findAll();
	}

	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}

	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}

	public Book updateBook(Book updatedBook) {
		return this.bRepo.save(updatedBook);
	}

	public String deleteBook(Long id) {
		this.bRepo.deleteById(id);
		return "Book" + id + "has been deleted";
	}

	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		// TODO Auto-generated method stub
		return null;
	}
}