/*	Matthew S. Coley
 * 	LibraryDB
 *  29 July 2015
 */

// Uses Apache Commons IO

package edu.nashcc.library;

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
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

/*	Change all Path path to File file
 *	change methods to use FileUtils lib
 * 	clean up code 
 */

public class FileOps {

	public static void appendFile(File file, String s) {
		try {
			FileUtils.writeStringToFile(file, s, true); // (file, String, boolean forces to not overwrite)
			FileUtils.writeStringToFile(file, "\n", true);
		}catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public static void changeFile(File file, String oldRecord, String newRecord) {
		try {
			// create .tmp file, copy .dat to .tmp, run iterator on .dat
			File destFile = new File("C:\\Java\\LibraryDB.dat.tmp");
			FileUtils.copyFile(file, destFile);
			LineIterator it = FileUtils.lineIterator(file);
			while(it.hasNext()){
				String line = it.nextLine();
				FileUtils.writeStringToFile(destFile, line);
				while(!line.equalsIgnoreCase(oldRecord)){
					FileUtils.writeStringToFile(destFile, line, true);
					FileUtils.writeStringToFile(destFile, "\n", true);
					line = it.nextLine();
				}
				if(line.equalsIgnoreCase(oldRecord)){
					FileUtils.writeStringToFile(destFile, newRecord, true);
					FileUtils.writeStringToFile(destFile, "\n", true);
				}
			}
			FileUtils.copyFile(destFile, file);
			FileUtils.deleteQuietly(destFile);
		} // end try
		catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public static void deleteFromFile(File file, String oldRecord) {

		try {
			// create .tmp file, copy .dat to .tmp without oldRecord, 
			// overwrite .dat with .tmp, delete .tmp
			File destFile = new File("C:\\Java\\LibraryDB.dat.tmp");
			FileUtils.copyFile(file, destFile);
			LineIterator it = FileUtils.lineIterator(file);
			FileUtils.writeStringToFile(destFile, "");
			while(it.hasNext()){
				String line = it.nextLine();
				FileUtils.writeStringToFile(destFile, line);
				while(!line.equalsIgnoreCase(oldRecord)){
					FileUtils.writeStringToFile(destFile, line, true);
					FileUtils.writeStringToFile(destFile, "\n", true);
					line = it.nextLine();
				}
			}
			FileUtils.copyFile(destFile, file);
			FileUtils.deleteQuietly(destFile);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static String displayRecord(File file, String s) {
		// just returns the top record, use lineIterator
		// also errors lel
		String str = "";
		try {
			LineIterator it = FileUtils.lineIterator(file);
			str = FileUtils.readFileToString(file);
			while(it.hasNext()){
				String line = it.nextLine();
				if(line.equalsIgnoreCase(s)){
					str = FileUtils.readFileToString(file);
				} else {
					str = "That record does not exist. \n\n\nE:Display";
				}
			}


		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return str;
	}

	public static String formatDisplay(String titleField, String authorField,
			String genreField, String iSBNField, String yearField){
		String str = "";
		try
		{
		String title, author, genre, iSBN, year;
		title = titleField;
		author = authorField;
		genre = genreField;
		;
		iSBN = iSBNField;
		year = yearField;
		
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
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return str;
	}
}
