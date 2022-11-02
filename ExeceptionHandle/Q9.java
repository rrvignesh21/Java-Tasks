import java.util.*;
/* Write a program to illustrate how to throw ClassNotFoundException.*/

class Q9{
	public static void main(String args[]){
		try{
			Class hello = Class.forName("Hello");
		}
		catch(ClassNotFoundException e){
			System.out.println(e);

		}
	}
}