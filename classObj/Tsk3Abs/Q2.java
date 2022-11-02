
abstract class Bank{
	abstract public double getBalance();
}

class BankA extends Bank{
	private double balance;
	BankA(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return this.balance;
	}
}

class BankB extends Bank{
	private double balance;
	BankB(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return this.balance;
	}
}

class BankC extends Bank{
	private double balance;
	BankC(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return this.balance;
	}
}

class Q2{

	public static void main(String args[]){
		BankA bankA = new BankA(100);
		BankB bankB = new BankB(150);
		BankC bankC = new BankC(200);
		System.out.println("Bank A balance : "+bankA.getBalance());
		System.out.println("Bank B balance : "+bankB.getBalance());
		System.out.println("Bank C balance : "+bankC.getBalance());	
	}
}