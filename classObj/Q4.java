import java.util.Scanner;

class Average{
	private int num1,num2,num3;
	Average(int num1,int num2,int num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	public void calculateAverage(){
		System.out.println("Average : "+(this.num1+this.num2+this.num3)/3.0);
	}
}

class Q4{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		Average average = new Average(num1,num2,num3);
		average.calculateAverage();
	}
}