package gui;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import main_package.*;

public class infections_page extends JFrame
{
	private JFrame infPageFrame = new JFrame();
	private JPanel mainPanel = new JPanel();
	private JButton backToLogin = new JButton("Back To Login Screen");
	private JTextArea mainText = new JTextArea(0,1);
	
	public infections_page(JFrame mainMenu, String email, connectedClass connector) {
		
		ArrayList<users> allUsers = connector.getUsersOfTheApp();
		
		for(users checkingUser : allUsers ) {
			if(checkingUser.getEmail().equals(email)) {
				mainText.setText(checkingUser.isInfected());
			}
			
		}
		
		
		backToLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setVisible(true);
				infPageFrame.dispose();
			}
			
		});
	
		
		mainPanel.add(mainText);
		mainPanel.add(backToLogin);
		infPageFrame.add(mainPanel);
		
		
		infPageFrame.pack();
		infPageFrame.setLocationRelativeTo(null);
		infPageFrame.setVisible(true);
		infPageFrame.setTitle("Πιθανή Μετάδοση Ιού");
		infPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
