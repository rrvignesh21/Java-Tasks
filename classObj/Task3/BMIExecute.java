package BMI.execute;
/* Create a BMI calculator by using packages and it should follows,

->> Create a package file 1 that contains a class that accepting a basic data members need for your calculator

->> Create a crisp method to calculate a BMI and return the result

->>Create another package file and create an object for the file 1 class and pass the respective arguments then call the method */
import BMI.datamember.*;
import BMI.calculator.*;
import java.util.Scanner;
class BMIExecute{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		BMIDataMember data = new BMIDataMember();
		System.out.println("Enter height in meters : ");
		double height = scan.nextDouble();
		System.out.println("Enter weight in kilogram: ");
		double weight = scan.nextDouble();
		data.setWeight(weight);
		data.setHeight(height);
		BMICalculator calculate = new BMICalculator(data);
		System.out.println("BMI : " + calculate.result());
	
	}
}
 
