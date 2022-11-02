import java.util.*;
/* Write a program to illustrate how to throw an ArrayOutOfBoundException.*/

class Q8{
	public static void main(String args[]){
		Q1 q1 = new Q1();
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