import java.util.Scanner;

abstract class Mark{
	abstract public double getPercentage();
}

class A extends Mark{
	private int mark1,mark2,mark3;
	private double percentage;
	A(int mark1,int mark2,int mark3){
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	public double getPercentage(){
		this.percentage = (this.mark1 + this.mark2 + this.mark3)/3.0;	
		return this.percentage;
	}
}

class B extends Mark{
	private int mark1,mark2,mark3,mark4;
	private double percentage;
	B(int mark1,int mark2,int mark3,int mark4){
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}
	public double getPercentage(){
		this.percentage = (this.mark1 + this.mark2 + this.mark3 + this.mark4)/4.0;	
		return this.percentage;
	}
}

class Q3{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student A marks[3 subjects] : ");
		int mark1A = scan.nextInt();
		int mark2A = scan.nextInt();
		int mark3A = scan.nextInt();
		System.out.println("Enter Student B marks[4 subjects]");
		A studentA = new A(mark1A,mark2A,mark3A);
		int mark1B = scan.nextInt();
		int mark2B = scan.nextInt();
		int mark3B = scan.nextInt();
		int mark4B = scan.nextInt();
		B studentB = new B(mark1B,mark2B,mark3B,mark4B);
		System.out.println("Student A percentage : " + studentA.getPercentage());
		System.out.println("Student B percentage : " + studentB.getPercentage());	
	}
}