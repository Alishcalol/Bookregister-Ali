package com.example.BookRegisterProjecktAli.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="book")
class Book {
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="author")
	String author;
	
	@Column(name="description")
	String description;
	
	@Column(name="name")
	String name;
	
	@Column(name="page_count")
	int pageCount;
	
	@Column(name="price")
	int price;

	public Book(String author, String description, String name, int pageCount, int price) {
		this.author = author;
		this.description = description;
		this.name = name;
		this.pageCount = pageCount;
		this.price = price;
	}

	public Book() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", author=" + author + ", description=" + description + ", name=" + name
				+ ", pageCount=" + pageCount + ", price=" + price + "]";
	}
	
	
	
	
}
