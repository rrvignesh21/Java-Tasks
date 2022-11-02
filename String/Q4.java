import java.util.Scanner;
/* Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.

Sample string : "The quick brown fox jumps over the lazy dog."

In the above string replace all the fox with cat.

Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 

New String: The quick brown cat jumps over the lazy dog. */
class Q4{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string 1 : ");
		String userString = scan.nextLine();
		System.out.println("Enter the word to be replace : ");
		String findString = scan.nextLine();
		System.out.println("Enter the replacing word : ");
		String replaceString = scan.nextLine();
		System.out.println("Before replacing : ");
		System.out.println(userString);
		userString = userString.replaceAll(findString,replaceString);
		System.out.println("After replacing : ");
		System.out.println(userString);
		
	}
}