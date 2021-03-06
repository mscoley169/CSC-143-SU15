package edu.nashcc.candle;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CandleDemo {

	public static void main(String[] args) {

		// instantiating a Candle object
		String color = userInput("Enter the color: ");
		int height = Integer.parseInt(userInput("Enter the height: "));
		Candle cand = new Candle(color, height);
		display(createString(cand));
		
		// instantiating a ScentedCandle object
		String color2 = userInput("Enter the color: ");
		String scent = userInput("Enter the scent: ");
		int height2 = Integer.parseInt(userInput("Enter the height: "));
		ScentedCandle sCand = new ScentedCandle(color2, height2, scent);
		display(createString(sCand));	
		
		
	}
	
	private static String userInput(String prompt){
		return JOptionPane.showInputDialog(null, prompt);
	}
	private static void display(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	private static String createString(Candle candle){
		StringBuilder sb = new StringBuilder();
		sb.append("Color: ");
		sb.append(candle.getColor());
		sb.append("\nHeight: ");
		sb.append(candle.getHeight());
		sb.append("\nPrice: ");
		sb.append(decForm(candle.getPrice()));
		return sb.toString();
	}
	private static String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#,##0.00");
		return formatter.format(decimal);
	}

}
