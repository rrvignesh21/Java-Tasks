import java.util.*;
/* Write a Java program to check if a sub-array is formed by consecutive integers from a given array of integers.
Input :
nums = { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 }
Output:
The largest sub-array is [1, 7]
Elements of the sub-array: 5 0 2 1 4 3 6 */
class Q8{
	public static boolean isConsecutive(int[] array,int i,int j){
		for(int k = i;k <= j-1;k++){
			for(int m = k+1;m <= j;m++){
			if(array[k] == array[m]){
				return false;
			}
		}
	}return true;
	
}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements : ");
		for(int i = 0;i < size;i++){
			array[i] = in.nextInt();
		}
		int length = 1;
		int start = 0;
		int end = 0;
		for(int i = 0;i < size;i++){
			for(int j = i+1;j < size;j++){
				if(isConsecutive(array,i,j)){
					if(length < j - i){
						length = j - i;
						start = i;
						end = j;
				}
			}
			
		}
	}
	System.out.println("The largest sub-array is : ["+start + "," + end + "]");
	System.out.print("Elements of the sub-array : ");
	for(int i = start;i <= end;i++){
		System.out.print(array[i] + " ");
	}
}
}