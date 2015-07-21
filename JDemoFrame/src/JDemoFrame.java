/*	Matthew S. Coley
 * 	21 July 2015
 * 	Ch 14 YDI
 */

import javax.swing.*;

public class JDemoFrame {
	public static void main(String[] args) {
		JFrame aFrame = new JFrame("This is a frame");
		final int WIDTH = 250;
		final int HEIGHT = 250;
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
		
		// second part, JDemoFrameThatCloses
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
