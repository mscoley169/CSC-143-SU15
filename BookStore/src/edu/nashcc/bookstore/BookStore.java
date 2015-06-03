/* Name: Matthew S. Coley
 * Assignment: Bookstore
 * Date: 3 June 2015
 */

package edu.nashcc.bookstore;

import javax.swing.JOptionPane;

public class BookStore {

	public static void main(String[] args) {

		// creating array of books
		String[] bookList = { "Harry Potter", "Animorphs", "East of Eden",
				"Jaws", "Lord of the Rings" };
		// getting input and converting it to lower + removing whitespace
		String userEntry = userInput();
		String formattedBook = formatBook(userEntry);

		// for loop to step through array
		boolean bookTest = false;
		for (int i = 0; i < bookList.length; ++i)
		{  //converting bookList items
			String formattedBookList = formatBook(bookList[i]);
			//if to test userEntry vs bookList
			if(formattedBook.equals(formattedBookList))
			{
				bookTest = true;
			}	
		}
		//if to display error/success
		if(bookTest){
			successMsg();
		}
		else {
			errorMsg();
		}
}

	private static String userInput() {
		String userInput = JOptionPane.showInputDialog(null,
				"Search for a book: ", "Books n Stuff",
				JOptionPane.QUESTION_MESSAGE);
		return userInput;
	}

	private static void errorMsg() {
		JOptionPane.showMessageDialog(null,
				"We do not have that book at this time.", "Books n Stuff",
				JOptionPane.WARNING_MESSAGE);
	}

	private static void successMsg() {
		JOptionPane.showMessageDialog(null,
				"We have that book in stock!", "Books n Stuff",
				JOptionPane.WARNING_MESSAGE);
	}

	// format book method to remove whitespace and convert to lower
	private static String formatBook(String book) {
		String formattedBook = book.replaceAll(" ", "").toLowerCase();
		return formattedBook;
	}
}
