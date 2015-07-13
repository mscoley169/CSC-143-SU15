/*	Matthew S. Coley
 * 	Chapter 12 You Do It p. 617-619
 * 	13 July 2015 
 */

package edu.nashcc.exception;

import javax.swing.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		int numerator = 0, denominator = 0, result = 0;
		String inputString;

		try {
			inputString = JOptionPane.showInputDialog(null,
					"Enter a number to be divided: ");
			numerator = Integer.parseInt(inputString);
			inputString = JOptionPane.showInputDialog(null,
					"Enter a number to divide into the first number: ");
			denominator = Integer.parseInt(inputString);
			result = numerator / denominator;
		} catch (ArithmeticException exception) {
			JOptionPane.showMessageDialog(null, exception.getMessage());
			result = 0;
		}
		JOptionPane.showMessageDialog(null, numerator + " / " + denominator
				+ "\nResult is " + result);

	}

}
