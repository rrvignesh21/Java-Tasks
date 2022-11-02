import java.util.Scanner;
/* Write a Java program to find first non repeating character in a string. */
class Q5{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String userString = scan.nextLine();
		for(int i = 0;i<userString.length();i++){
			boolean unique = true;
			for(int j = 0;j < userString.length();j++){
			if(i != j && userString.charAt(i) == userString.charAt(j)){
			unique = false;
			break;
				}
			}if(unique){ 
				System.out.println("The first non repeating character in a string is "+userString.charAt(i));
				break;
			}
		}

		
	}
}