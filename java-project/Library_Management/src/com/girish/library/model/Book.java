/**
 * 
 */
package com.girish.library.model;

/**
 * 
 */
public class Book {
	private Integer id;
	private String title;
	private String author;
	private Integer publishYear;
	private Integer numberOfPages;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public void setAuthor(String auther) {
		this.author = auther;
	}
	public Integer getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(Integer publishYear) {
		this.publishYear = publishYear;
	}
	public Integer getNumberOfPages() {
		return numberOfPages;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", auther=" + author + ", publishYear=" + publishYear
				+ ", numberOfPages=" + numberOfPages + "]";
	}
	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public Book(Integer id, String title, String author, Integer publishYear, Integer numberOfPages) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
		this.numberOfPages = numberOfPages;
	}
}
