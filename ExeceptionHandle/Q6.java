import java.util.*;
/* Write a program to describe the usage of throws clause. */

class Q6{
	public static int division(int number1,int number2)throws ArithmeticException{
		return (number1/number2);
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numberator and Denominator : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		try{
		System.out.println("Result : "+division(num1,num2));
		}
		catch(ArithmeticException e){
			System.out.println("Denominator can't be Zero");
		}
	}
}