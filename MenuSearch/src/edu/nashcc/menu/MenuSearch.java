/* Matthew S. Coley
 * Ch 9 You Do It
 * 10 June 2015 
 */

package edu.nashcc.menu;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MenuSearch {

	public static void main(String[] args) {
		String[] menuChoices = new String[10];
		String entry = "", menuString = "";
		int x = 0;
		int numEntered;
		int highestSub = menuChoices.length - 1;

		Arrays.fill(menuChoices, "zzzzzzz");

		String prompt = "Enter an item for today's menu, or zzz to quit:";
		menuChoices[x] = userInput(prompt);
		while (!menuChoices[x].equals("zzz") && x < highestSub) {
			menuString = menuString + menuChoices[x] + "\n";
			++x;
			if (x < highestSub)
				menuChoices[x] = userInput(prompt);
		}
		numEntered = x;

		entry = userInput("Today's menu is:\n" + menuString
				+ "Please make a selection:");
		
		Arrays.sort(menuChoices, 0, numEntered);
		x = Arrays.binarySearch(menuChoices, entry);
		if(x >= 0 && x < numEntered)
			JOptionPane.showMessageDialog(null, "Excellent choice!");
		else
			JOptionPane.showMessageDialog(null, "Sorry - that item is not on tonight's menu.");
			}

	public static String userInput(String prompt) {
		return JOptionPane.showInputDialog(null, prompt);
	}

}
