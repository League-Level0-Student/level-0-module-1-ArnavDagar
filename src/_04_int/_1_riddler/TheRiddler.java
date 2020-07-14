package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int playerScore;
		playerScore = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = JOptionPane.showInputDialog("What 4-letter word can be written forward, backward or upside down, and can still be read from left to right?");
		if (riddle1.equals("NOON")) {
			playerScore = playerScore + 1;
			JOptionPane.showMessageDialog(null, "CORRECT!");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "WRONG! The answer is NOON");
		}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer
		String riddle2 = JOptionPane.showInputDialog("What kind of goose fights snakes?");
		if (riddle2.equals("mongoose")) {
			
			playerScore = playerScore + 1;
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
		else {
			
			JOptionPane.showMessageDialog(null, "WRONG! The answer is mongoose");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score was");
	}
}

