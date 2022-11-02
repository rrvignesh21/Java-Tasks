import java.util.*;
/* Write a Java program to add two matrices of the same size. */

class Q2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int row = in.nextInt();
		System.out.println("Enter the column size : ");
		int column = in.nextInt();
		int[][] matrix1 = new int[row][column];
		int[][] matrix2 = new int[row][column];
		int[][] result = new int[row][column];
 		System.out.println("Enter the matrix 1 values : ");
		for(int i = 0;i<row;i++){
			for(int j = 0;j<column;j++){
				matrix1[i][j] = in.nextInt();			
			}
		}
		System.out.println("Enter the matrix 2 values : ");
		for(int i = 0;i<row;i++){
			for(int j = 0;j<column;j++){
				matrix2[i][j] = in.nextInt();
				result[i][j] = matrix1[i][j] + matrix2[i][j];			
			}
		}
		System.out.println("Sum of two matrix : ");
		for(int i = 0;i<row;i++){
			for(int j = 0;j<column;j++){
			 	System.out.print(result[i][j]+" ");			
			}
			System.out.print("\n");
		}		
	}
}