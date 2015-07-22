package edu.nashcc.library;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class LibraryApp {

	private JFrame frame;
	private JTextField bookTitleField;
	private JTextField authorField;
	private JTextField genreField;
	private JTextField iSBNField;
	private JTextField yearField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Path library = Paths.get("C:\\Java\\LibraryDB.txt");
		FileOps.createFile(library, "");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryApp window = new LibraryApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibraryApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(25, 11, 46, 14);
		frame.getContentPane().add(lblTitle);
		
		bookTitleField = new JTextField();
		bookTitleField.setBounds(25, 31, 86, 20);
		frame.getContentPane().add(bookTitleField);
		bookTitleField.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(25, 62, 46, 14);
		frame.getContentPane().add(lblAuthor);
		
		authorField = new JTextField();
		authorField.setBounds(25, 81, 86, 20);
		frame.getContentPane().add(authorField);
		authorField.setColumns(10);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setBounds(25, 112, 46, 14);
		frame.getContentPane().add(lblGenre);
		
		genreField = new JTextField();
		genreField.setBounds(25, 131, 86, 20);
		frame.getContentPane().add(genreField);
		genreField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ISBN");
		lblNewLabel.setBounds(25, 162, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		iSBNField = new JTextField();
		iSBNField.setBounds(25, 179, 86, 20);
		frame.getContentPane().add(iSBNField);
		iSBNField.setColumns(10);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(25, 210, 46, 14);
		frame.getContentPane().add(lblYear);
		
		yearField = new JTextField();
		yearField.setBounds(25, 230, 86, 20);
		frame.getContentPane().add(yearField);
		yearField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(121, 31, 178, 219);
		frame.getContentPane().add(textPane);
		
		JButton addBtn = new JButton("Add Record");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String title, author, genre, iSBN;
				int year;
				try
				{
					title = bookTitleField.getText();
					author = authorField.getText();
					genre = genreField.getText();
					iSBN = iSBNField.getText();
					year = Integer.parseInt(yearField.getText());
					LibraryBook myBook = new LibraryBook(title, author, genre, iSBN, year);
					System.out.println(myBook.toString()); // file writer class/method?
					Path library = Paths.get("C:\\Java\\LibraryDB.txt");
					FileOps.appendFile(library, myBook.toString());
				}
				catch(Exception e)
				{
					e.printStackTrace();
					return;
				}
			}
		});
		addBtn.setBounds(309, 30, 115, 23);
		frame.getContentPane().add(addBtn);
		
		/* For changeBtn, delBtn, recordBtn:
		 * will need to test each field to
		 * search through records 
		 */
		
		JButton changeBtn = new JButton("Change Record");
		changeBtn.setBounds(309, 80, 115, 23);
		frame.getContentPane().add(changeBtn);
		
		JButton delBtn = new JButton("Delete Record");
		delBtn.setBounds(309, 130, 115, 23);
		frame.getContentPane().add(delBtn);
		
		JButton recordBtn = new JButton("Show Record");
		recordBtn.setBounds(309, 178, 115, 23);
		frame.getContentPane().add(recordBtn);
		
		JButton statsBtn = new JButton("Statistics");
		statsBtn.setBounds(309, 227, 115, 23);
		frame.getContentPane().add(statsBtn);
		
	}
}
