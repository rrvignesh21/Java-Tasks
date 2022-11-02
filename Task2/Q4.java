import java.util.Scanner;
/* Two numbers are entered through the keyboard. 
Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method). */
class Q4{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a base : ");  	
		int base = in.nextInt();
		System.out.print("Enter a power : ");  	
		int power = in.nextInt();
		int result = 1;
		while(power != 0){
			result = result * base;
			power--;
		}
		System.out.println("Result : " +result);
	}
}