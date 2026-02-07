/**
 * 
 */
package com.girish.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class Library {
	
	
	Book book;
	private List<Book> books = new ArrayList<>();
	
	public void addBook(Integer id, String title, String auther, Integer publishYear, Integer numberOfPages){
		book = new Book(id, title, auther, publishYear, numberOfPages);
		books.add(book);
	}
	public void findBookByAuthor(String author) {
		if (book.getAuthor().equals(author)) {
            System.out.println(book);
        }
	}
	public List<Book> findLatestBooks(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublishYear() > year) {
                result.add(book);
            }
        }
        return result;
    }
	public List<Book> findBooksByComplexCriteria(int year, int minPages, String authorSubstring) {
	    String subStringLower = authorSubstring.toLowerCase();

	    return books.stream()
	        
	        .filter(book -> book.getPublishYear() > year)
	        
	        .filter(book -> book.getNumberOfPages() >= minPages)
	        
	        .filter(book -> book.getAuthor().toLowerCase().contains(subStringLower))
	        
	        .collect(Collectors.toList());
	}
}
