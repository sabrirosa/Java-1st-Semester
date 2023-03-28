/*
*GuessApp.java
*@author Sabrina Rosa
*20-10-2022
*/

import javax.swing.JOptionPane;

public class GuessApp{
	public static void main(String args[]){

		//Declare variables
		int numRan = (int)(Math.random() * 10) + 1;
		int num;
		String message;

		Guess gp = new Guess();

		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the number"));
		gp.setNum(num);

		gp.compute();

		message = gp.getMessage();
		JOptionPane.showMessageDialog(null, "" + message);
		JOptionPane.showMessageDialog(null, "You guessed " + num + ".  The number guessed was " + numRan);

		//Output

	}
}