import java.util.Scanner;
import java.lang.*;
/* Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000. */
class Q2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a float value : ");  	
		double userNumber = in.nextDouble();
		
		if(userNumber < 1){
			System.out.println("Small\n");	
		}
		else if(userNumber > 1000000){
			System.out.println("Large\n");	
		}
		if(userNumber == 0.0){
			System.out.println("Zero");
		}
		else if(userNumber > 0.0){
			System.out.println("Positive");	
		}
		else if(userNumber < 0.0){
			System.out.println("Negative");	
		}
	}
}