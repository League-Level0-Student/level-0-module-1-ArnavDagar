package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		String Bob = "I'm tall!";
		String Fred = "I'm small!";
		String Other = "I'm medium!";
		
		String input = JOptionPane.showInputDialog("Who do you want to learn more about?");
		
		if (input.equals("Bob")) {
			JOptionPane.showMessageDialog(null , Bob);
		}
		else if (input.equals("Fred")) {
			JOptionPane.showMessageDialog(null, Fred);
		}
		
		else {
			JOptionPane.showMessageDialog(null, Other);
		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	
		}
}
}

