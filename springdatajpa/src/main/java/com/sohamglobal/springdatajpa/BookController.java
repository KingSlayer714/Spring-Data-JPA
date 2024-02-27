package com.sohamglobal.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sohamglobal.springdatajpa.entities.Book;
import com.sohamglobal.springdatajpa.servicies.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookserv;
	
	@GetMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@GetMapping("/newbook")
	public String newBook()
	{
		return "newbook.jsp";
	}
	
	@PostMapping("/addbook")
	public String addBook(Book b)
	{
		return bookserv.addBook(b);
	}
	
	@GetMapping("/allbook")
	public ModelAndView allBook()
	{
		return bookserv.showAllBook();
	}
	
	@PostMapping("/modifyprice")
	public ModelAndView modifyPrice(int bookid,float newPrice)
	{
		return bookserv.changePrice(bookid, newPrice);
	}
	
	@PostMapping("/deletebook")
	public ModelAndView deleteBook(int bookid)
	{
		return bookserv.deleteBook(bookid);
	}
	
	@GetMapping("/search")
	public String search()
	{
		return "search.jsp";
	}
	
	@GetMapping("/searchbook")
	public String searchBook()
	{
		return "searchBook.jsp";
	}
	
	@PostMapping("/searchByAuthor")
	public ModelAndView searchByAuthor(String author)
	{
		return bookserv.searchByAuthor(author);
	}
	
	@PostMapping("/searchByGenre")
	public ModelAndView searchByGenre(String genre)
	{
		return bookserv.searchByGenre(genre);
	}
	
	@PostMapping("/searchByPriceRange")
	public ModelAndView searchByPriceRange(float minprice,float maxprice)
	{
		return bookserv.searchByPriceRange(minprice, maxprice);
	}
	
	@PostMapping("/searchByGenreAndLanguage")
	public ModelAndView searchByGenreAndLanguage(String genre,String language)
	{
		return bookserv.searchByGenreAndLanguage(genre, language);
	}
	
	@PostMapping("/searchByMaxPages")
	public ModelAndView searchByMaxPages(float maxpages)
	{
		return bookserv.searchByMaxPages(maxpages);
	}
	
	@PostMapping("/searchByPublisherYear")
	public ModelAndView searchByPublisherYear(int publicationyear)
	{
		return bookserv.searchByPublisherYear(publicationyear);
	}
}
