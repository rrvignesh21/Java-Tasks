

class Employee{

	private String name;
	private int year_Of_Joining;
	private String address;
	Employee(String name,int year_Of_Joining,String address){
		this.name = name;
		this.year_Of_Joining = year_Of_Joining;
		this.address = address;
	}
	public void displayEmployeeInfo(){
		System.out.println(this.name + "\t\t" + this.year_Of_Joining + "\t\t\t" + this.address);
	}
}

class Q3{

	public static void main(String args[]){
		Employee employee1 = new Employee("Robert",1994,"64C- WallsStreat");
		Employee employee2 = new Employee("Sam",2000,"68D- WallsStreat");
		Employee employee3 = new Employee("John",1999,"26B- WallsStreat");		
		System.out.println("Name\tYear of joining\t\t\tAddress");
		employee1.displayEmployeeInfo();
		employee2.displayEmployeeInfo();
		employee3.displayEmployeeInfo();
	}
}