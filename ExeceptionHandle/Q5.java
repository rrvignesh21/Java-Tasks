import java.util.*;
/* Write a program to illustrate how to use multiple catch statements. */
class Q5{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of the Array : ");
		try {
			int sizeOfArray = scan.nextInt();
			int[] intArray = new int[sizeOfArray];
			System.out.println("Enter array elements : ");
			for(int i = 0;i<sizeOfArray;i++){
				intArray[i] = scan.nextInt();
			}
			System.out.println("Enter index : ");
			int index = scan.nextInt();
			System.out.println("Element in "+index +" is "+intArray[index]);
			
		}
		catch(NegativeArraySizeException e){
			System.out.println("Size of the array can't be Negative");
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of Bound");
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally Block");
			
		}
	}
	
}