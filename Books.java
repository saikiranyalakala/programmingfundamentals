package com.manipal.collection.demo;

public class Books {
String bookId,bookTitle,author;
double price;
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Books(String bookId, String bookTitle, double price, String author) {
	super();
	this.bookId = bookId;
	this.bookTitle = bookTitle;
	this.author = author;
	this.price = price;
}
public Books(String bookTitle)
{this.bookTitle=bookTitle;
	
}

}
