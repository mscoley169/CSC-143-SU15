package edu.nashcc.library;

public class LibraryBook {
	// needs to accept book title, author, year, genre, record number/ISBN
	private String bookTitle, author, genre, iSBN;
	private int year;
	
	public LibraryBook(String bookTitle, String author, String genre,
			String iSBN, int year) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.genre = genre;
		this.iSBN = iSBN;
		this.year = year;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getiSBN() {
		return iSBN;
	}
	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString(){
		return bookTitle + "," + author + "," + genre + "," + iSBN + "," + year;
	}
	
	
}
