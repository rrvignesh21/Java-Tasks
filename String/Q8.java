import java.util.Scanner;
import java.util.regex.*;
/* Write a Java program to match two strings where one string contains wildcard characters. */
class Q8{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String userinput = scan.nextLine();
		String matchString = scan.nextLine();
		//matchString.replace("*","\\*");
		//matchString.replace("?","\\?");
		if(userinput.matches(matchString)){
			System.out.println("The given pattern is match");
		}
		else{
			System.out.println("The given pattern is not a match");
		}
	}

}