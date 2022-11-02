import java.util.*;
/* Create a Automated Teller Machine Backend Logic using Encapsulation technique in Java */
class BankAccount{
	private String bankName;
	private String accountHolderName;
	private String pin;
	private double balance;
	BankAccount(){
		this.balance = 0;
	}
	public void setBankName(String bankName){
		this.bankName = bankName;
	}
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	public void setPin(String pin){
		this.pin = pin;
	}
	public void withdraw(double amount){
		this.balance -= amount;	
	}
	public void deposit(double amount){
		this.balance += amount;
	}
	public String getBankName(){
		return this.bankName;
	}
	public String getAccountHolderName(){
		return this.accountHolderName;
	}
	public boolean checkPin(String inputpin){
		return inputpin.equals(this.pin);
	}
	public double getBalance(){
		return this.balance;
	}
}

class ATM{

	private  ArrayList<BankAccount> users = new ArrayList<BankAccount> ();
	public static Scanner scan = new Scanner(System.in); 
	public void createUser(){
		BankAccount newuser = new BankAccount();
		System.out.println("Enter Bank Name : ");
		String bankName = scan.nextLine();
		System.out.println("Enter Account Holder Name : ");
		String accountHolderName = scan.nextLine();
		System.out.println("Enter your new Pin : ");
		String pin = new String(); 
		for(int i = 0;i < 1;i++){
			pin = scan.nextLine();
			if(!checkPinSize(pin)){
				i--;
				System.out.println("Invalid Pin,Try Again\nEnter Pin : ");
			}
		}
		newuser.setBankName(bankName);
		newuser.setAccountHolderName(accountHolderName);
		newuser.setPin(pin);
		users.add(newuser);		
	}
	public boolean checkPinSize(String pin){
		if(pin.length() != 4){
			return false;
		}
		for(int i = 0;i < pin.length();i++){
			if(pin.charAt(i) >= 48 && pin.charAt(i) <= 57){
				continue;			
			}
			else{
				return false;
			}
		}
		return true;
	}
	public int checkUser(String accountHolderName,String pin){
		int index = 0;
		for(BankAccount temp : users){
			if(temp.getAccountHolderName().equals(accountHolderName) && temp.checkPin(pin)){
				return index;
			}
			index++;
		}
		return -1;
	}
	public int login(){
		System.out.println("Enter Account Holder Name : ");
		String accountHolderName = scan.nextLine();
		System.out.println("Enter your new Pin : ");
		String pin = new String();
		for(int i = 0;i<1;i++){
			pin = scan.nextLine();
			if(!checkPinSize(pin)){
				i--;
				System.out.println("Invalid Pin,Try Again\nEnter Pin : ");
			}
		}
		if(checkUser(accountHolderName,pin) >= 0){
			return checkUser(accountHolderName,pin);
		}
		else{
			return -1;
		}
	}
	public void setNewPin(int userId){	
		System.out.println("Enter New Pin : ");
		String newPin = scan.nextLine();
		if(checkPinSize(newPin)){
			users.get(userId).setPin(newPin);
			System.out.println("Pin Changed");
		}
		else{
			System.out.println("Invalid Pin!!");
		}
	}
	public void deposit(int index,double amount){
		if(amount < 100 || amount > 50000){
			System.out.println("Can't deposit more than 50000 or less than 100");
		}
		else{
		users.get(index).deposit(amount);
		System.out.println(amount + " is deposited to your account.");
		}
	}
	public void withdraw(int index,double amount){
		if(amount > 10000 || amount < 100){
			System.out.println("Can't withdraw more than 10000 or less than 100");
		}
		else{
		if(users.get(index).getBalance() < amount){
			System.out.println("Insufficient balance");
		}
		else{
		users.get(index).withdraw(amount);
		System.out.println(amount + " is withdraw from your account.");
		}
		}
	}
	public void viewBalance(int index){
		System.out.println("Account Balance : " + users.get(index).getBalance());
	}
}

class ATMInterface{

	public static void main(String args[]){
		ATM atm = new ATM();
		boolean flag = true;
		while(flag){
		System.out.println("\t\t1.New User\n\t\t2.Login\n\t\t3.exit\n");
		int option = ATM.scan.nextInt();
		ATM.scan.nextLine();
		if(option == 1){		
			atm.createUser();
		}	
		else if(option == 2){
			int userindex = atm.login();
			if(userindex >= 0){
			System.out.println("\t\t1.Deposit\n\t\t2.Withdraw\n\t\t3.View Account Balance\n\t\t4.Change Pin\n");
			int userOption = ATM.scan.nextInt();
			ATM.scan.nextLine();
			if(userOption == 1){
				System.out.print("Enter Deposit Amount : ");
				double depositAmount = ATM.scan.nextDouble();
				atm.deposit(userindex,depositAmount);
			}
			else if(userOption == 2){
				System.out.print("Enter Withdraw Amount : ");
				double withdrawAmount = ATM.scan.nextDouble();
				atm.withdraw(userindex,withdrawAmount);
			}
			else if(userOption == 3){
				atm.viewBalance(userindex);
			}
			else if(userOption == 4){	
				atm.setNewPin(userindex);
			}
			}
			else{
				System.out.println("Invalid pin or name");
			}
		}
		else if(option == 3){
			flag = false;
		}
		else{
			flag = false;
		}
	}				
	}
}