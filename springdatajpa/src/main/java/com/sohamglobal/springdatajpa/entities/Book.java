package com.sohamglobal.springdatajpa.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookid;
	
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	
	@Column(name= "publisher_year")
	private int publicationyear;
	
	

	private String genre;
	private String description;
	private Float price;
	private Float pages;
	private String language;
	
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublicationyear() {
		return publicationyear;
	}

	public void setPublicationyear(int publicationyear) {
		this.publicationyear = publicationyear;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getPages() {
		return pages;
	}

	public void setPages(Float pages) {
		this.pages = pages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher="
				+ publisher + ", publicationyear=" + publicationyear + ", genre=" + genre + ", description="
				+ description + ", price=" + price + ", pages=" + pages + ", language=" + language + "]";
	}
	
	

}
