package fr.dawan.dao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class frame extends JFrame {
	public frame() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(90, 61, 110, 21);
		getContentPane().add(panel);
		
		JButton Rename = new JButton("New label");
		Rename.setBounds(54, 110, 91, 14);
		getContentPane().add(Rename);
	}
}
