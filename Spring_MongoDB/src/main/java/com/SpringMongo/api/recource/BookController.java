package com.SpringMongo.api.recource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.SpringMongo.api.Model.Book;
import com.SpringMongo.api.service.Bookservice;

@RestController
public class BookController {
	
	@Autowired
   private Bookservice Repository;
	
	@PostMapping("/addbook")
	public String saveBook(@RequestBody Book book)
	{
		Repository.save(book);
		return "ADD Book with id :"+book.getId();
	}
	
	
	
	@GetMapping("/findallbooks")
    public List<Book> getBooks()
    {
       return Repository.findAll();	
    }
	
	@GetMapping("/findbook/{id}")
	public Optional<Book> geyBook(@PathVariable int id)
	{
		return Repository.findById(id);
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) 
	{
		Repository.deleteById(id);
	  return "Book deleted with id "+id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
