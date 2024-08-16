package com.nama.springboot.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	private String bookName;
	private int bookId;
	private String authorName;
	private int noOfCopies;
	
	
	public Book()
	{
		System.out.println("Book bean created..");
	}
	
	
	public Book(int bookId, String bookName,String authorName, int noOfCopies) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.authorName = authorName;
		this.noOfCopies = noOfCopies;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + ", authorName=" + authorName + ", noOfCopies="
				+ noOfCopies + "]";
	}


	@Override
	public boolean equals(Object obj) {
		return  this.bookId == ((Book)obj).bookId;
	}
	
	
	

}

