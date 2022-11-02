import java.util.*;
/* Write a Java program to sort a numeric array and a string array. */

class Q1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = in.nextInt();
		System.out.println("1.Integer Array\n2.String Array");	
		int option = in.nextInt();
		if(option == 1){
		int[] integerArray = new int[size];
		System.out.println("Enter the elements : ");
		for(int i = 0;i<size;i++){
			integerArray[i] = in.nextInt();
		}
		Arrays.sort(integerArray);
		System.out.println("Sorted Array : " + Arrays.toString(integerArray));
		}
		if(option == 2){
		String[] stringArray = new String[size];
		System.out.println("Enter the elements : ");
		for(int i = 0;i<size;i++){
			stringArray[i] = in.nextLine();			
		}
		Arrays.sort(stringArray);
		System.out.println("Sorted Array : "+ Arrays.toString(stringArray));		
		}
	}
}