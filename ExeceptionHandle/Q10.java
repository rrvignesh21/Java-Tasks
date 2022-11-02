import java.util.*;
/* Write a program to illustrate how to throw NumberFormatException.*/

class Q10{
	public static void main(String args[]){
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter string number : ");
			String number = scan.nextLine();
			int stringTonumber = Integer.parseInt(number);
			System.out.println("Result : "+stringTonumber);			
		}
		catch(NumberFormatException e){
			System.out.println("Invalid Input String to convert Integer");

		}
	}
}