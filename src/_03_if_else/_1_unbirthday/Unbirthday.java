package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("When is your birthday (enter in mm/dd form)");
	String todayDate = "07/06";
	if (input.equals(todayDate)) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
}
	else {
		JOptionPane.showMessageDialog(null, "Merry Unbirthday!");
}
}
}