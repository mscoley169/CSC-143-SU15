package edu.nashcc.vehicle;

import javax.swing.JOptionPane;

public class Bicycle extends Vehicle {
	public Bicycle() {
		super("a person", 2);
	}

	public void setPrice() {
		String entry;
		final int MAX = 4000;
		entry = JOptionPane.showInputDialog(null, "Enter bicycle price ");
		price = Integer.parseInt(entry);
		if (price > MAX) {
			price = MAX;
		}
	}

	public String toString() {
		return ("The bicycle is powered by " + getPowerSource() + "; it has "
				+ getWheels() + " and costs $" + getPrice());
	}
}
