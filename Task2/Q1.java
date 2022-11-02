import java.util.Scanner;
import java.lang.*;
/* Write a Java program to solve quadratic equations (use if, else if and else). */
class Q1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of a: ");  	
		double a = in.nextDouble();
		System.out.print("Enter the value of b: ");  
		double b = in.nextDouble();
		System.out.print("Enter the value of c: ");  
		double c = in.nextDouble();
		double d = (b*b)-(4.0*a*c);
		double sqrroot = Math.sqrt(Math.abs(d));
		if(d > 0.0){
			double root1 = (-b + sqrroot) / (2.0 * a);  
			double root2 = (-b - sqrroot) / (2.0 * a);  
			System.out.println("The roots are "+root1 + " and "+root2);
		}
		else if(d == 0){
			double root = -b/(2.0*a);
			System.out.println("the root is "+root);
		}
		else{
			double rootRealPart = -b/(2.0*a);
			double rootImgPart = sqrroot;
			System.out.println("The root are "+ rootRealPart+ "+i" + rootImgPart + " and "+rootRealPart+"-i"+rootImgPart);
		}			
	}
}