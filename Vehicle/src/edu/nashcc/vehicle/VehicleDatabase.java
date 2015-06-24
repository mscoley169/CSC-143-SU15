package edu.nashcc.vehicle;

import javax.swing.JOptionPane;

public class VehicleDatabase {

	public static void main(String[] args) {

		Vehicle[] vehicles = new Vehicle[5];
		int x;
		for (x = 0; x < vehicles.length; ++x) {
			String userEntry;
			int vehicleType;
			userEntry = JOptionPane
					.showInputDialog(
							null,
							"Please select the type of\nvehicle you want to enter: \n1 - Sailboat\n2 - Bicycle");
			vehicleType = Integer.parseInt(userEntry);
			if (vehicleType == 1) {
				vehicles[x] = new Sailboat();
			} else {
				vehicles[x] = new Bicycle();
			}
		}
		StringBuffer outString = new StringBuffer();
		for (x = 0; x < vehicles.length; ++x) {
			outString.append("\n#" + (x + 1) + " ");
			outString.append(vehicles[x].toString());
		}
		JOptionPane.showMessageDialog(null, "Out available vehicles include:\n"
				+ outString);
	}

}
