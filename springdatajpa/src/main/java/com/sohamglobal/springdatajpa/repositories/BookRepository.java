package com.sohamglobal.springdatajpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sohamglobal.springdatajpa.entities.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
Book findByBookid(int bookid);
List<Book> findByAuthor(String author);
List<Book> findByGenre(String genre);
List<Book> findByPriceBetween(float minprice, float maxprice);
List<Book> findByGenreAndLanguage(String genre, String language);
List<Book> findByPagesLessThan(float maxpages);
List<Book> findByPublicationyear(int publicationyear);
}
