package edu.nashcc.library;

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.text.*;

public class FileOps {
	
	public static void createFile(Path file, String s) {
		try {
			OutputStream outputStr = new BufferedOutputStream(
					Files.newOutputStream(file, CREATE));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					outputStr));
				writer.write(s, 0, s.length());
				writer.write("\n");
			writer.close();
		} catch (Exception e) {
			System.out.println("Error message: " + e);
		}
	}
	public static void appendFile(Path file, String s){
		try
		{
			OutputStream outStr = new BufferedOutputStream(Files.newOutputStream(file, APPEND));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outStr));
			writer.write(s + "\n");
			writer.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
	}
}
