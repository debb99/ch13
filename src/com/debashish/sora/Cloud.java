package com.debashish.sora;

import javax.swing.JFrame;

public class Cloud {
	public static void main(String[] args) {
		JFrame cloudFrame = new CloudFrame("Fifty Clouds");
		cloudFrame.setSize(500, 500);
		cloudFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cloudFrame.setLocationRelativeTo(null);
		cloudFrame.setVisible(true);

	}

}
