
class UserException extends Exception{
	int number;
	UserException(int number){
		this.number = number;
	}
	public String toString(){
		return ("Exception number : " + this.number);	
	}
	

}


class Q7{

	public static void main(String args[]){
		try{
			throw new UserException(12);
			
		}
		catch(UserException e){
			System.out.println(e);
		}
	}
}