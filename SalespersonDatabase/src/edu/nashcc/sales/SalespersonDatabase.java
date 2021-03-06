/*	Matthew S. Coley
 * 	SalespersonDB
 * 	29 June 2015
 */

package edu.nashcc.sales;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class SalespersonDatabase {

	public static void main(String[] args) {
		// creating 20 item arraylist
		ArrayList<Salesperson> salespersonDB = new ArrayList<Salesperson>(20);

		// user input + StringBuilder for initial prompt
		StringBuilder sb = new StringBuilder();
		sb.append("What would you like to do?\n\n");
		sb.append("1 --- Add an item to the list.\n");
		sb.append("2 --- Delete an item from the list.\n");
		sb.append("3 --- Change an item on the list.\n");
		sb.append("0 --- QUIT");
		String userChoice = userInput(sb.toString());

		
		// I don't even...
		while (!userChoice.equals("0")) {
			String userID;
			int userSales;
			switch (userChoice) {
			case "1":
				if (salespersonDB.size() < 20) { 										
					userID = userInput("Enter the salesperson ID you wish to add:");
					userSales = Integer
							.parseInt(userInput("Enter the sales amount:"));
					Salesperson sp = new Salesperson(userID, userSales);
					salespersonDB.add(sp);
				} else {
					errorMsg("full");
				}
				break;
			case "2":
				if (salespersonDB.isEmpty()) {
					errorMsg("empty");
				} else {
					userID = userInput("Enter the salesperson ID you wish to remove:");
					Iterator<Salesperson> it = salespersonDB.iterator();
					Salesperson found = null;
					while (it.hasNext()) {
						Salesperson sp = it.next();
							if(sp.getID().equals(userID)){
								found = sp;
							}
					}
					if (found != null) {
					it.remove();
					displayMsg("Successfully deleted.");
				} else {
					displayMsg("That ID does not exist."); 
				}	
				}
				break;
			case "3":
				userID = userInput("Enter the ID you wish to change:");
				Iterator<Salesperson> it1 = salespersonDB.iterator();	// iterator to test
				Salesperson sp1 = it1.next(); 							// else if
				if (salespersonDB.isEmpty()) {
					errorMsg("empty");
				} else if (!sp1.getID().equals(userID)) {
					displayMsg("That ID does not exist.");
				} else {
					Iterator<Salesperson> it2 = salespersonDB.iterator();
					while (it2.hasNext()) {
						Salesperson sp2 = it2.next();
						if (sp2.getID().equals(userID)) {
							String newID = userInput("Enter the new ID:");
							sp2.setID(newID);
							displayMsg("Successfully changed.");
						} // only works on salespersonDB[0]
					}	  // was working correctly until I fixed
						  // the delete case (case "2")
				}
			}
			// updating userChoice
			userChoice = userInput(sb.toString());
		} // end while(userChoice != "0")
	}

	public static String userInput(String prompt) {
		return JOptionPane.showInputDialog(null, prompt);
	}

	public static void errorMsg(String prompt) {
		JOptionPane.showMessageDialog(null, "Database is " + prompt + ".");
	}

	public static void displayMsg(String prompt) {
		JOptionPane.showMessageDialog(null, prompt);
	}

}
