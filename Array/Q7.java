import java.util.*;
/* Write a Java program to check if a given array contains a subarray with 0 sum
Input :
nums1= { 1, 2, -2, 3, 4, 5, 6 }
nums2 = { 1, 2, 3, 4, 5, 6 }
nums3 = { 1, 2, -3, 4, 5, 6 }
Output:
Does the said array contain a subarray with 0 sum: true
Does the said array contain a subarray with 0 sum: false
Does the said array contain a subarray with 0 sum: true */
class Q7{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = in.nextInt();
		int[] integerArray = new int[size];
		System.out.println("Enter the elements : ");
		for(int i = 0;i < size;i++){
			integerArray[i] = in.nextInt();
		}
		int[] sumArray = new int[size];
		int sum = 0;
		int flag = 0;
		for(int i = 0;i< size;i++){
			sum = sum + integerArray[i];
			Arrays.sort(sumArray);
			if(Arrays.binarySearch(sumArray,sum) > 0 | sum == 0){
				flag = 1;
				System.out.println("Does the said array contain a subarray with 0 sum : true");
				break;
			}
			sumArray[i] = sum;
		}
		if(flag == 0){
			System.out.println("Does the said array contain a subarray with 0 sum : false");	
		}
		
					
	}
}