package edu.nashcc.sales;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SalespersonDatabase {

	public static void main(String[] args) {
	// creating 20 item arraylist
	ArrayList salesperson = new ArrayList(20);
	
	// user input + StringBuilder for initial prompt
	StringBuilder sb = new StringBuilder();
	sb.append("What would you like to do?\n\n");
	sb.append("1 --- Add an item to the list.\n");
	sb.append("2 --- Delete an item from the list.\n");
	sb.append("3 --- Change an item on the list.\n");
	sb.append("0 --- QUIT");
	String userChoice = userInput(sb.toString());
	
	while(userChoice != "0"){
		
	// user input for ID and sales	
	int ID = Integer.parseInt(userInput("Enter the ID: "));
	double sales = Double.parseDouble(userInput("Enter the sales amount: "));
	
		
	// updating userChoice
	userChoice = userInput(sb.toString());
	} // end while(userChoice != "0")
		
	}
	
	public static String userInput(String prompt){
		return JOptionPane.showInputDialog(null, prompt);
	}
	
	
}
