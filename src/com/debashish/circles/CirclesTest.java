package com.debashish.circles;

import javax.swing.JFrame;

public class CirclesTest {
	public static void main(String[] args) {
		JFrame myFrame= new JFrame("Circles");
		myFrame.setSize(450, 450);
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		myFrame.add(new CirclesPanel());
		
		myFrame.setVisible(true);
	}
}
