package com.jasmine.Show.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jasmine.Show.models.Book;
import com.jasmine.Show.services.BookService;

@RestController
public class BooksApi{
	    private final BookService bookService;
		private BookService BookService;
	    public BooksApi(BookService bookService, com.jasmine.Show.services.BookService BookService){
	        this.bookService = null;
			this.BookService = BookService;
	    }
	    @RequestMapping(value="/api/books", method=RequestMethod.PUT)
	    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
	        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
	        return book;
	    }
	    
	    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
	    public void destroy(@PathVariable("id") Long id) {
	        bookService.deleteBook(id);
	    }
	}
