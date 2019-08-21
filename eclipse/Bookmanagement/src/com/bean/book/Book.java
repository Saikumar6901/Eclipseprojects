package com.bean.book;

public class Book {
	 int bookid;
	 String title,author;
	 int price;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, String title, String author, int price) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return bookid+" "+title+" "+author+" "+price;
	}

}
