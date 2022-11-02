import java.util.Scanner;
import java.lang.*;
/* Write a Java program to add two binary numbers. */
class Q4{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter binary number 1 : ");
		String binary1 = in.nextLine();
		System.out.println("Enter binary number 2 : ");
		String binary2 = in.nextLine();
		int number1 = Integer.parseInt(binary1,2);
		int number2 = Integer.parseInt(binary2,2);
		int sum = number1 + number2;
		System.out.println("Sum of " + binary1 + " and "+binary2 + " is "+ Integer.toBinaryString(sum));					
	}
}