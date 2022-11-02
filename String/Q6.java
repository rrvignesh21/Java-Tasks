import java.util.Scanner;
/* Write a Java program to divide a string in n equal parts. */
class Q6{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String userString = scan.nextLine();
		System.out.println("Enter the number of part : ");
		int slicingpart = scan.nextInt();
		int part = userString.length()/slicingpart ;
		int index = 0;
		while(index < userString.length()){
			if(index + part < userString.length()){
			System.out.println(userString.substring(index,index+part));
			}
			else{
			System.out.println(userString.substring(index));
			break;
			}index = index + part;
		}
		
		
	}
}