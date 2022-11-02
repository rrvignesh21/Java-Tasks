import java.util.Scanner;
/* Write a Java program to compare two strings lexicographically. Two strings are 
lexicographically equal if they are the same length and contain the same characters in the same positions. */
class Q2{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string 1 : ");
		String userString1 = scan.nextLine();
		System.out.println("Enter the string 2 : ");
		String userString2 = scan.nextLine();
		if(userString1.equals(userString2)){
			System.out.println("Both string is equal");
		}
		else{
			System.out.println("Both string is not equal");
		}
		
	}
}