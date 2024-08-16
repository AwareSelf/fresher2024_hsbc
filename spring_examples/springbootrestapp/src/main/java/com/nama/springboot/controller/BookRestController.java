package com.nama.springboot.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nama.springboot.dao.BookDao;
import com.nama.springboot.exception.BookNotFoundException;
import com.nama.springboot.model.Book;

@RestController
public class BookRestController {
	
	@Autowired
	BookDao bookdao;
	
	@GetMapping("book/{bookid}")
	public Book getBook(@PathVariable int bookid)
	{
	    Book b =  this.bookdao.getBook(bookid);	
	    
	    
	    if(b==null)
	    	throw new BookNotFoundException("Book with id:"+bookid+" not found");
	    else
	      return b;
	    
	    
	}
	
	
	@GetMapping("book1/{bookid}")
	public ResponseEntity getBook1(@PathVariable int bookid)
	{
	    Book b =  this.bookdao.getBook(bookid);	
	    
	 	    
	    if(b==null)
	    {
	    	return ResponseEntity.notFound().build();
	    }
	    else
	    {
	      return ResponseEntity.ok(b.toString());
	    }
	    
	}
	
	
	@PostMapping("addbook")
	public String addBook(@RequestBody Book b)
	{
		boolean r = this.bookdao.addBook(b);
		
		
		if(r)
		{
			return "Book with bookid:"+b.getBookId()+" added successfully..";
		}
		else
		{
			return "Not able to add book with bookid:"+b.getBookId();
		}
				
		
	}
	
	
	@PostMapping("addbook1")
	public ResponseEntity<Book> addBook1(@RequestBody Book b)
	{
		boolean r = this.bookdao.addBook(b);
		
		if(!r)
			return ResponseEntity.noContent().build();
		

		 URI location = ServletUriComponentsBuilder
		            .fromCurrentContextPath()
		            .path("/book/{id}")
		            .buildAndExpand(b.getBookId())
		            .toUri();
		 
			return ResponseEntity.created(location).build();
		
	}
	
	@GetMapping("allbooks")
	public List<Book> getAllBooks()
	{
		return this.bookdao.getAllBooks();
	}
	
//	org.springframework.web.bind.annotation.DeleteMapping
	@DeleteMapping("rembook")
	public String removeBook(@RequestBody Book b)
	{
		boolean status =this.bookdao.removeBook(b);
		
		if(status)
		{
			return "Book with bookid:"+b.getBookId()+" deleted successfully";
		}
		else
		{
			return "Not able to delete Book with bookid:"+b.getBookId();
		}
		
	}
	
	@DeleteMapping("rembook/{bookid}")
	public String removeBook(@PathVariable int bookid)
	{
		boolean status =this.bookdao.removeBook1(bookid);
		
		if(status)
		{
			return "Book with bookid:"+bookid+" deleted successfully";
		}
		else
		{
			return "Not able to delete Book with bookid:"+bookid;
		}
		
	}
	
	@DeleteMapping("rembook1/{bookid}")
	public ResponseEntity<String> removeBook1(@PathVariable int bookid)
	{
		boolean status =this.bookdao.removeBook1(bookid);
		
		if(status)
		{
			return ResponseEntity.ok("Book removed with bookid:"+bookid);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
		
	}
	
	

}
