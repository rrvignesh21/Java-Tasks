
abstract class Parent{
	abstract public void message();
}

class Child1 extends Parent{
	public void message(){
		System.out.println("This is first subclass");
	}
}

class Child2 extends Parent{
	public void message(){
		System.out.println("This is second subclass");
	}
}

class Q1{

	public static void main(String args[]){
	Child1 child1 = new Child1();		
	Child2 child2 = new Child2();
	child1.message();
	child2.message();
	
	}
}