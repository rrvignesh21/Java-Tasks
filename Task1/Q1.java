
import java.util.Scanner;
/* Write a Java program that takes a number as input and prints its multiplication table up to 10. */
class Q1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int userInput = in.nextInt();
		for(int i = 1;i<=10;i++){
			System.out.println(userInput + "X" + i + "=" + i*userInput);
		}			

	}

}