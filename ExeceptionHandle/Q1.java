/* Write a program to illustrate how to throw an exception. */
import java.util.*;
class Q1{
	public static void checkAge(int i){
		if(i < 18){
			throw new  ArithmeticException("this person is not Eligible");
		}
		else{
			System.out.println("This person is Eligible");
		}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = scan.nextInt();
		checkAge(age);
	}
	
}