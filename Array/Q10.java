import java.util.*;
/* Write a Java program to form the largest number from a given list of non negative integers.
Example:
Input :
nums = {1, 2, 3, 0, 4, 6}
Output:
Largest number using the said array numbers: 643210 */
class Q10{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements : ");
		for(int i = 0;i < size;i++){
			array[i] = in.nextInt();
		}
		Arrays.sort(array);
		String result = "";
		for(int i = size - 1;i >= 0;i--){
			result = result + array[i];
		}
		System.out.println("Largest number using the said array numbers: "+result);		
	}
}