import java.util.*;
/* Write a Java program to replace every element with the next best element (from right side) in a given array of integers.
 There is no element next to the last element, therefore replace it with -1. */

class Q6{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = in.nextInt();
		int[] integerArray = new int[size];
		System.out.println("Enter the elements : ");
		for(int i = 0;i < size;i++){
			integerArray[i] = in.nextInt();
		}
		int maxfromright = integerArray[size -1];
		integerArray[size - 1] = -1;
		for(int i = size - 2;i >= 0;i--){
			int temp = integerArray[i];
			integerArray[i] = maxfromright;
			if(maxfromright < temp){
				maxfromright = temp;
			}
		}
		System.out.println(Arrays.toString(integerArray));			
	}
}