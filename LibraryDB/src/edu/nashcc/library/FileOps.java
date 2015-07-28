package edu.nashcc.library;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;

/*	Change all Path path to File file
 *	change methods to use FileUtils lib
 * 	clean up code 
 */

public class FileOps {

	public static void createFile(File file, String s) {
		try {
			FileUtils.writeStringToFile(file, s);
		} catch (Exception e) {
			System.out.println("Error message: " + e);
		}
	}

	public static void appendFile(File file, String s) {
		try {
		//	OutputStream outStr = new BufferedOutputStream(
		//			Files.newOutputStream(file, APPEND));
		//	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
		//			outStr));
		//	writer.write(s + "\n");
		//	writer.close();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public static void changeFile(Path file, String oldRecord, String newRecord) {
		// need to search for entry, replace it
		// changeFile(Path file, String s) -- String s will search for every
		// field/entire myBook.toString()
		// will not work lel

		try {
			InputStream iStream = new BufferedInputStream(
					Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					iStream));
			OutputStream outStr = new BufferedOutputStream(
					Files.newOutputStream(file, WRITE));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					outStr));
			String testRec;
			do {
				testRec = reader.readLine();

				if (oldRecord.equalsIgnoreCase(testRec)) {
					// call delete method on oldRecord

					writer.write(newRecord);

				} // end if

			} while (testRec != null);
			writer.close();

		} // end try
		catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public static void deleteFromFile(String oldRecord) {

		try {
			// read file, alter file, lolwat idk...

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static String displayRecord(String titleField, String authorField,
			String genreField, String iSBNField, String yearField) {
		// need to check each text field and search file, display matches
		String str = "";

		/*
		 * Currently not working. Displays the text fields, does not search the
		 * file. Need to figure out how to properly access and read from file
		 * then display that record
		 */

		try {
			// attempting to search file? lolidk

			FileInputStream inStream = new FileInputStream(
					"C:\\Java\\LibraryDB.dat");
			FileChannel fileChan = inStream.getChannel();
			String title, author, genre, iSBN, year;
			title = titleField;
			author = authorField;
			genre = genreField;
			;
			iSBN = iSBNField;
			year = yearField;
			// String str = title + "," + author + "," + genre + "," + iSBN +
			// "," + year;
			StringBuilder sb = new StringBuilder();
			sb.append("Title:\t");
			sb.append(title);
			sb.append("\n\nAuthor:\t");
			sb.append(author);
			sb.append("\n\nGenre:\t");
			sb.append(genre);
			sb.append("\n\nISBN:\t");
			sb.append(iSBN);
			sb.append("\n\nYear:\t");
			sb.append(year);
			str = sb.toString();
			byte[] data = str.getBytes();
			ByteBuffer byteBuf = ByteBuffer.wrap(data);
			fileChan.read(byteBuf);

			/*
			 * //while(title != null){ // infinite loop FIX String[] strArray =
			 * str.split(","); if(strArray[0].equalsIgnoreCase(title)){ //
			 * textPane.setText(str); book = str; System.out.println(str);//
			 * testing output }
			 */// }

		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return str;
	}

	public static void displayStats(Path file) { // unnecessary atm
		// displays attributes of file
	}

}
