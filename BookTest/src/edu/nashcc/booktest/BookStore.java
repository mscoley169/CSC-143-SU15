package edu.nashcc.booktest;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BookStore {

	public static void main(String[] args) {

		// creating array of books
		String[] bookList = { "Harry Potter", "Animorphs", "East of Eden",
				"Jaws", "Lord of the Rings" };
		// parallel array with prices
		Double[] bookPrices = { 19.99, 9.99, 14.99, 6.99, 19.99 };

		// getting input
		String userEntry = userInput();

		// initializing variables to create book object
		String bookName = "";
		double itemPrice = 0;

		// for loop to step through array
		boolean bookTest = false;
		String formattedBook = formatBook(userEntry); // formats for .equals()
		for (int i = 0; i < bookList.length; ++i) { // converting bookList items
			String formattedBookList = formatBook(bookList[i]);
			// if to test userEntry vs bookList
			if (formattedBook.equals(formattedBookList)) {
				bookTest = true;
				bookName = bookList[i];
				itemPrice = bookPrices[i];
			} // end if
		} // end for loop

		/*
		 * Instantiating book object. Probably a much more efficient and
		 * preferred method. Wanted to attempt creating an array of book objects
		 * but did not want to run into issues with iterator again
		 */
		Book book = new Book(bookName, itemPrice);

		// if to display error/success
		if (bookTest) {
			successMsg();
			JOptionPane.showMessageDialog(null, book.getName() + "\n"
					+ decForm(book.getPrice()));
		} else {
			errorMsg();
		} // end if-else
	} // end of main()

	// static dialog methods for input/output
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
		JOptionPane.showMessageDialog(null, "We have that book in stock!",
				"Books n Stuff", JOptionPane.INFORMATION_MESSAGE);
	}

	// format book method to remove whitespace and convert to lower
	private static String formatBook(String book) {
		String formattedBook = book.replaceAll(" ", "").toLowerCase();
		return formattedBook;
	}

	// decimal formatter
	private static String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#,##0.00");
		return formatter.format(decimal);
	}
}
