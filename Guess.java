/*
*Guess.java
*@author Sabrina Rosa
*20-10-2022
*/

	public class Guess{

	//Declare variables
		int numRan;
		int num;
		String message;

	//Constructor
	public Guess(){
	}

	//Compute
	public void compute(){
		if(num == numRan){
			message = "Congratulations! You got it";
		}
		else if (numRan > num){
			message = "You guessed to low";
		}
		else {
			message = "You guessed to high";
		}

	}
	// Setters and Getters
		public void setNum(int num){
			this.num = num;
		}
		public String getMessage(){
			return message;
		}

}