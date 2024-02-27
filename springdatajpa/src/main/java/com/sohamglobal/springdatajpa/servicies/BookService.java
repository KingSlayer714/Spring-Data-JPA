package com.sohamglobal.springdatajpa.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.sohamglobal.springdatajpa.entities.Book;
import com.sohamglobal.springdatajpa.repositories.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepo;
    
    public String addBook(Book b)
    {
    	bookRepo.save(b);
    	System.out.println("new book added succuessfully");
		return "addStatus.jsp";
    }
    
    public ModelAndView showAllBook()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ShowAllBooks.jsp");
		
		List<Book> booklist=bookRepo.findAll();
		mv.addObject("blist", booklist);
		System.out.println("number of rows retrived :"+booklist.size());
		return mv;
	}
    
    public ModelAndView changePrice(int bookid,float newPrice)
    {
    	Book obj=bookRepo.findByBookid(bookid);
    	obj.setPrice(newPrice);
    	bookRepo.save(obj);
    	
    	return showAllBook();
    }
    
    public ModelAndView deleteBook(int bookid)
    {
    	Book obj=bookRepo.findByBookid(bookid);
    	bookRepo.delete(obj);
    	
    	return showAllBook();
    }
    
    public ModelAndView searchByAuthor(String author)
    {
    	ModelAndView mv=new ModelAndView();
		mv.setViewName("SearchResultOnAuthor.jsp");
		
		List<Book> booklist=bookRepo.findByAuthor(author);
		//System.out.println(booklist.size());
		mv.addObject("blist", booklist);
		return mv;
    }
    
    public ModelAndView searchByGenre(String genre)
	{
    	ModelAndView mv=new ModelAndView();
		mv.setViewName("SearchResultOnGenre.jsp");
		
		List<Book> booklist=bookRepo.findByGenre(genre);
		//System.out.println(booklist.size());
		mv.addObject("blist", booklist);
		return mv;
	}
    
    public ModelAndView searchByPriceRange(float minprice,float maxprice)
	{
    	ModelAndView mv=new ModelAndView();
		mv.setViewName("SearchResultOnPriceRange.jsp");
		
		List<Book> booklist=bookRepo.findByPriceBetween(minprice,maxprice);
		//System.out.println(booklist.size());
		mv.addObject("blist", booklist);
		return mv;
	}
    
    public ModelAndView searchByGenreAndLanguage(String genre,String language)
	{
    	ModelAndView mv=new ModelAndView();
		mv.setViewName("SearchResultOnGenreAndLanguage.jsp");
		
		List<Book> booklist=bookRepo.findByGenreAndLanguage(genre,language);
		//System.out.println(booklist.size());
		mv.addObject("blist", booklist);
		return mv;
	}
	
	public ModelAndView searchByMaxPages(float maxpages)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("SearchResultOnMaxPages.jsp");
		
		List<Book> booklist=bookRepo.findByPagesLessThan(maxpages);
		//System.out.println(booklist.size());
		mv.addObject("blist", booklist);
		return mv;
	}
	
	public ModelAndView searchByPublisherYear(int publicationyear)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("SearchResultOnPublisherYear.jsp");
		
		List<Book> booklist=bookRepo.findByPublicationyear(publicationyear);
		//System.out.println(booklist.size());
		mv.addObject("blist", booklist);
		return mv;
	}
}
