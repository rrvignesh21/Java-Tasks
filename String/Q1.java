import java.util.Scanner;
/* Write a Java program to get the character at the given index within the String. */
class Q1{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String userString = scan.nextLine();
		System.out.println("Enter the index : ");
		int index = scan.nextInt();
		if(index >= userString.length()){
			System.out.println("index out of range");
		}
		else{
			System.out.println("Character at "+index + " : "+userString.charAt(index));
		}
		
	}
}