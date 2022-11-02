import java.util.*;
/* Write a program to illustrate how to throw an ArrayOutOfBoundException.*/

class Q8{
	public static void main(String args[]){
		int[] array = {1,2,3,4,5,6,7,8,9,10,11};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter index : ");
		try{
		int index = scan.nextInt();
		if(index > array.length){
			throw new ArrayIndexOutOfBoundsException("Index is larger than size of array");
		}
		System.out.println("Element in "+index + " is "+array[index]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}