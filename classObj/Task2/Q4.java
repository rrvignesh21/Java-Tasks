
/* Create an Instance Initializer block and explain the relation between Instance Inititilizer block with constructor */
class Q4{

	int number;
	String str;
	Q4(){
		System.out.println("Number is "+number+"\nString is "+str);
	}
	{
	number = 12;
	str = "Hello";
	}
	public static void main(String args[]){
		Q4 q = new Q4();
		
	}

}