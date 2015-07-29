/*	Matthew S. Coley
 * 	LibraryDB
 *  29 July 2015
 */

// Uses Apache Commons IO

package edu.nashcc.library;

import java.awt.Font;
public class LibraryBook {
	// needs to accept book title, author, year, genre, record number/ISBN
	private String bookTitle, author, genre, iSBN, year;
	
	public LibraryBook(String bookTitle, String author, String genre,
			String iSBN, String year) {
		setBookTitle(bookTitle);
		setAuthor(author);
		setGenre(genre);
		setiSBN(iSBN);
		setYear(year);
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String toString(){
		return bookTitle + "," + author + "," + genre + "," + iSBN + "," + year;
	}
	public String displayBook(){
		String[] fields = { "Title:" , "Author:" , "Genre:" , "ISBN:" , "Year:" };
		String[] data = { bookTitle , author , genre , iSBN, year };
		StringBuilder sb = new StringBuilder();
		try
		{
			//sb.append("<html><body>");
			for(int i = 0; i < 5; i++){
			//sb.append("<b>");
			sb.append(fields[i]);
			//sb.append("</b>");
			sb.append("\t");
			sb.append(data[i]);
			sb.append("\n\n");
		}
			//sb.append("</body></html>");
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	
}
