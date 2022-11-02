import java.util.Scanner;
/* Write a Java program to read two strings append them together and return the result. If the strings are different lengths,
 remove characters from the beginning of the longer string and make them equal length.  */
class Q10{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string 1 : ");
		String userString1 = scan.nextLine();
		System.out.println("Enter the string 2 : ");
		String userString2 = scan.nextLine();
		if(userString1.length() != userString2.length()){
			if(userString1.length() > userString2.length()){
				System.out.println(userString1.substring(userString1.length() - userString2.length(),userString1.length()) + userString2);
			}
			if(userString1.length() < userString2.length()){
				System.out.println(userString1 + userString2.substring(userString2.length() - userString1.length(),userString2.length()));
			}
		}
		else{
			System.out.println(userString1 + userString2);
		}	
	
	}
}