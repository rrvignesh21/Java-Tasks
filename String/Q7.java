import java.util.Scanner;
/* Write a Java program to check if two given strings are rotations of each other.

Sample Output:

The given strings are: ABACD  and  CDABA

The concatenation of 1st string twice is: ABACDABACD

The 2nd string CDABA  exists in the new string.

Strings are rotations of each other */
class Q7{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string 1 : ");
		String userString1 = scan.nextLine();
		System.out.println("Enter the string 2 : ");
		String userString2 = scan.nextLine();
		if(userString1.length() != userString2.length()){
			System.out.println("No " + userString2 + " is not a rotation of " + userString1);
		}
		else{
			String string3 = userString1.concat(userString1);
			if(string3.contains(userString2)){
				System.out.println("Yes " + userString2 + " is rotation of " + userString1);
			}
			else{
				System.out.println("No " + userString2 + " is not a rotation of " + userString1);
			}
		}		
	}
}