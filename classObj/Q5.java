import java.util.Scanner;

class Student{
	private String name,phoneNumber,address;
	private int rollNumber;
	
	Student(String name,String phoneNumber,String address,int rollNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.rollNumber = rollNumber;
	}
	public void printStudentInfo(){
		System.out.println("Student Name : "+this.name+ "\nStudent roll number : "+ this.rollNumber +"\nStudent Phone Number : "+this.phoneNumber+"\nStudent Address : "+this.address);
	}


}

class Q5{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter john phone numbers : ");
		String johnPhoneNumber = scan.nextLine();
		System.out.println("Enter john address : ");
		String johnAddress = scan.nextLine();
		System.out.println("Enter sam phone numbers : ");
		String samPhoneNumber = scan.nextLine();
		System.out.println("Enter sam address : ");
		String samAddress = scan.nextLine();
		Student student1 = new Student("sam",samPhoneNumber,samAddress,1);
		Student student2 = new Student("john",johnPhoneNumber,johnAddress,2);
		student1.printStudentInfo();
		System.out.println("\n\n");
		student2.printStudentInfo();
	}
}