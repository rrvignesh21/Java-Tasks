import java.util.*;
/* Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.
Input :
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10] */
class Q9{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array 1 : ");
		int size1 = in.nextInt();
		int[] Array1 = new int[size1];
		System.out.println("Enter the elements : ");
		for(int i = 0;i < size1;i++){
			Array1[i] = in.nextInt();
		}
		System.out.println("Enter the size of array 2 : ");
		int size2 = in.nextInt();	
		int[] Array2 = new int[size2];
		System.out.println("Enter the elements : ");
		for(int i = 0;i < size2;i++){
			Array2[i] = in.nextInt();
		}
		for(int i = 0;i < size1;i++){
			if(Array1[i] > Array2[0]){
				int temp = Array1[i];
				Array1[i] = Array2[0];
				Array2[0] = temp;
				int j;
				for(j = 1;j < size2 && Array2[j] < temp;j++){
					Array2[j - 1] = Array2[j];
				}
				Array2[j - 1] = temp;
			}
	
		}System.out.println("Array 1 : " + Arrays.toString(Array1));
		System.out.println("Array 2 : " + Arrays.toString(Array2));		
	}
}