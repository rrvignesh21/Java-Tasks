/*Prevent Overload */
class Class1{
	private void function(){

	System.out.println("Hello");
	
	}

}


class Class2 extends Class1{

	public void function(int i){
		System.out.println("HI!! "+i*3);
	}
}

class Q3{
	public static void main(String args[]){
	Class1 cls = new Class1();
	Class2 cls2 = new Class2();
	//cls.function();
	cls2.function(3);
	
	}
	
}