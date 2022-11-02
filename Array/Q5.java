import java.util.*;
/* Write a Java program to sort an array of positive integers of a given array.
 In the sorted array the value of the first element should be maximum,
 second value should be minimum value, third should be the second maximum, fourth second be second minimum and so on. */

class Q5{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = in.nextInt();
		int[] integerArray = new int[size];
		System.out.println("Enter the elements : ");
		for(int i = 0;i<size;i++){
			integerArray[i] = in.nextInt();
		}
		Arrays.sort(integerArray);
		int low = 0,high = size-1;
		int[] temp = integerArray.clone();
		for(int i = 0;i < size;i++){
			if(i % 2 == 0){
				integerArray[i] = temp[high--];
			}
			else{
				integerArray[i] = temp[low++];
			}		
		}
		System.out.println(Arrays.toString(integerArray));
			
	}
}