import java.util.*;
/* Write a program using try and catch block where check whether the given array size is negative or not. */
class Q2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of the Array : ");
		
		try{
			int sizeOfArray = scan.nextInt();
			int[] intArray = new int[sizeOfArray];
			System.out.println("Enter array elements : ");
			for(int i = 0;i<sizeOfArray;i++){
				intArray[i] = scan.nextInt();
			}
			System.out.println("Array Elements : ");
			for(int i = 0;i<sizeOfArray;i++){
				System.out.print(intArray[i] + " ");
			}
		}
		catch(NegativeArraySizeException e){
			System.out.println("Size of the array can't be Negative");
		}
	}
	
}