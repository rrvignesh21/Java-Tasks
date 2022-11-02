import java.util.Scanner;
/* Write a Java program to create a new string from a given string by swapping the last two characters of the given string.
 The length of the given string must be two or more. */
class Q9{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String userString = scan.nextLine();
		char lastchar = userString.charAt(userString.length() - 1);
		char penchar = userString.charAt(userString.length() - 2);
		userString = userString.substring(0,userString.length() - 2);
		userString = userString + lastchar + penchar;
		System.out.println(userString);
	}
}