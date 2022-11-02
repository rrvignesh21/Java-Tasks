
class Cls1{
	int some(){
		return 123;
	}
}
class Cls2 extends Cls1{
	public int some()
	{
		return 34;
	}
}

class SingletonClass{
	private static SingletonClass singletonInstance = new SingletonClass();
	int number;
	String string;
	private SingletonClass(){

	}
	public static SingletonClass getInstance(){
		return singletonInstance;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public void setString(String string){
		this.string = string;
	}
	public void display(){
		System.out.println("Number : "+this.number + "\nString : "+this.string);
	}
}

class DontKnow{
	public static void main(String args[]){
	// Cls1 c1 = new Cls1();
	// Cls2 c2 = new Cls2();
	// System.out.println(c1.some() + " "+c2.some());
	SingletonClass sin1 = SingletonClass.getInstance();
	SingletonClass sin2 = SingletonClass.getInstance();
	sin1.setNumber(123455);
	sin2.setString("HELLO!!");
	sin1.display();
	System.out.println("2nd Instance Values");
	sin2.display();
	}	
}