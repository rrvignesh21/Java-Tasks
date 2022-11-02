import java.util.*;
/* Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
Sample array: [1,2,4,5,6]
Target value: 6. */

class Q3{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = in.nextInt();
		int[] integerArray = new int[size];
		System.out.println("Enter the elements : ");
		for(int i = 0;i<size;i++){
			integerArray[i] = in.nextInt();
		}	
		System.out.println("Enter the target number : ");
		int target = in.nextInt();
		Arrays.sort(integerArray);
		for(int i = 0;i < size;i++){
			int searchelement = target-integerArray[i];
			int indexOfsearchedValue = Arrays.binarySearch(integerArray,searchelement);
			if(indexOfsearchedValue < 0 || indexOfsearchedValue == i){
				continue;
			}
			else{
			System.out.println("Result : "+integerArray[i] + " and "+integerArray[indexOfsearchedValue]);
			break;
			}	
		}
	}
}