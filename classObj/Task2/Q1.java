
/*Write a program for dynamic binding and static binding in Java*/
class Animals{
	public void behavior(){
		System.out.println("Making sound");
	}
	
}

class Cats extends Animals{
	public void behavior(){
		System.out.println("Cats meow");
	}
}

class Dogs extends Animals{

	public void behavior(){
		System.out.println("Dogs barks");
	}
}

class Q1{

	public static void main(String args[]){
		Animals cat = new Cats(); // dynamic binding
		Dogs dog = new Dogs(); // static binding
		cat.behavior();
		dog.behavior();
		
	}
}