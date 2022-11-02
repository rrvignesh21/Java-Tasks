import java.util.Scanner;
import java.lang.*;
/* Write a program in Java to display the n terms of odd natural number and their sum.
Input number of terms is: 5
Expected Output :
The odd numbers are :                                                           
1                                                                               
3                                                                               
5                                                                               
7                                                                               
9                                                                               
The Sum of odd Natural Number up to 5 terms is: 25 */
class Q3{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");  	
		int userInput = in.nextInt();
		System.out.println("The Odd numbers are : ");
		int sumOfOdd = 0;
		int count = 0;
		int i = 1;
		while(count != userInput){
			System.out.println(i);
			sumOfOdd = sumOfOdd + i;
			i = i + 2;
			count++;		
		}
		System.out.println("The Sum of odd Natural Number up to "+ userInput+" terms is: " + sumOfOdd);
}
}