package com.baeldung.boot.jsp.repository.model;

public class BookData {
    private String isbn;
    private String name;
    private String author;
    
	
	  public BookData(String isbn, String name, String author) { this.isbn = isbn;
	  this.name = name; this.author = author; }
	  
	  public String getIsbn() { return isbn; }
	  
	  public void setIsbn(String isbn) { this.isbn = isbn; }
	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}