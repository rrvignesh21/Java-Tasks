import java.util.Scanner;
/* Write a Java program to swap two variables. */

class Q2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number1 : ");
		int userInput1 = in.nextInt();
		System.out.println("Enter the number2 : ");
		int userInput2 = in.nextInt();
		System.out.println("Before Swapping : ");
		System.out.println("Number 1 : "+userInput1);
		System.out.println("Number 2 : "+userInput2);
		int temp = userInput1;
		userInput1 = userInput2;
		userInput2 = temp;
		System.out.println("After Swapping : ");
		System.out.println("Number 1 : "+userInput1);
		System.out.println("Number 2 : "+userInput2);			

	}

}