import java.util.*;
/* Write a Java program to print all the LEADERS in the array.
Note: An element is leader if it is greater than all the elements to its right side. */

class Q4{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = in.nextInt();
		int[] integerArray = new int[size];
		System.out.println("Enter the elements : ");
		for(int i = 0;i<size;i++){
			integerArray[i] = in.nextInt();
		}
		for(int i = 0;i < size-1;i++){
			int j;
			for(j = i+1;j<size;j++){
				if(integerArray[i] <= integerArray[j]){
					break;
				}		
			}
			if(j == size){
				System.out.print(integerArray[i] + " ");
			}
		}
	}
}