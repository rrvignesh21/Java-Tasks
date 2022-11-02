package p2;
import java.util.Scanner;
import p1.*;
public class Circle{ 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int radius;
		radius = scan.nextInt();
		Area area = new Area();
		area.areaOfCircle(radius);
		
	}							
}