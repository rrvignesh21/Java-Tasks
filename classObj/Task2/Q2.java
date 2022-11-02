/*Prevent Overriding*/
class Class1{
	private void function(){

	System.out.println("Hello");
	
	}

}


class Class2 extends Class1{

	public void function(){
		System.out.println("HI!!");
	}
}

class Q2{
	public static void main(String args[]){
	Class1 cls = new Class1();
	Class2 cls2 = new Class2();
	cls.function();
	cls2.function();
	
	}
	
}