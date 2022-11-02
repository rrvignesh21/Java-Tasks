import java.util.Random;  
import java.util.Scanner; 
/* Write a program that generates a random number and asks the user to guess hat the number is.
 If the user's guess is higher than the random number, the program should display "Too high, try again."
 If the user's guess is lower than the random number, the program should display "Too low, try again." 
The program should use a loop that repeats until the user correctly guesses the random number. */
class Q5{
	public static void main(String args[]){
	Random random = new Random();   
	int randomNumber = random.nextInt(10);
	boolean flag = true;
	Scanner in = new Scanner(System.in); 
	while(flag){
		System.out.println("Guess a number between 0 to 10 : ");
		int userInput = in.nextInt();
		if(userInput == randomNumber){
			System.out.println("Correctly guessed !!");
			flag = false;
		} 
		else if(userInput > randomNumber){
			System.out.println( "Too high, try again.");			
			}
		else if(userInput < randomNumber){
			System.out.println( "Too low, try again.");			
			}	
		}
	}	
}