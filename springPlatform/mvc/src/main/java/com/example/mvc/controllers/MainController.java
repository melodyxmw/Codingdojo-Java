package com.example.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mvc.models.Book;
import com.example.mvc.services.BookService;

@RestController
public class MainController {

    private final BookService bookService;
    public MainController(BookService bookService){
        this.bookService = bookService;
    }
    
    
    
    // other methods removed for brevity
//  @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
//    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
//        return book;
//    }
//    
//    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
//    public void destroy(@PathVariable("id") Long id) {
//        bookService.deleteBook(id);
//    }
    @RequestMapping("/api/books")
    public List<Book>index(){
    	return bookService.allBooks();
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book update(@RequestParam(value="title") String title, 
    					@RequestParam(value="description") String desc,
    					@RequestParam(value="language") String lang,
    					@RequestParam(value="pages") Integer numOfPages) {
    	Book newBook = new Book(title, desc,lang, numOfPages);
      return bookService.createBook(newBook);
    
    }
}
