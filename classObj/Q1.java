

class Student{

	private String name;
	private int roll_no;
	Student(int roll_no,String name){
		this.name = name;
		this.roll_no = roll_no;
	}
	public void displayStudentInfo(){
		System.out.println("Student name : " + this.name + "\nStudent Roll number : " + this.roll_no);
	}


}

class Q1{

	public static void main(String args[]){
		
		Student student = new Student(2,"john");
		student.displayStudentInfo();
	}
}