import java.util.*;
/* Write a simple ticket booking system using polymorphism in Java */
class Theatre{
	String theatreName;
	String theatreLocation;
	public void setTheatreName(String theatreName){
		this.theatreName = theatreName;
	}	
	public void setTheatreLocation(String theatreLocation){
		this.theatreLocation = theatreLocation;
	}
	public String getTheatreName(){
		return this.theatreName;
	}
	public String getTheatreLocation(){
		return this.theatreLocation;
	}
}

class Show extends Theatre{
	int showId;
	Boolean[] seats = new Boolean[120];
	int noOfSeatsAvailible;
	int showTime;
	String filmName;
	int priceperSeat;
	Show(int showId,int showTime,String filmName,int priceperSeat){
		this.showId = showId;
		Arrays.fill(this.seats,Boolean.FALSE);
		this.noOfSeatsAvailible = 120;
		this.showTime = showTime;
		this.filmName = filmName;
		this.priceperSeat = priceperSeat;		
	}
	public int getPrice(){
		return this.priceperSeat;
	}
	public int getShowId(){
		return this.showId;
	}
	public int getShowTime(){
		return this.showTime;
	}
	public String getFilmName(){
		return this.filmName;
	}
	public int getNoOfSeatsAvailible(){
		return this.noOfSeatsAvailible;
	}
	public void setNoOfSeatsAvailible(int noOfSeats){
		this.noOfSeatsAvailible -= noOfSeats;
	}	
	public void bookSeat(int seatNo){
		this.seats[seatNo -1] = true;
	}
	public boolean checkAvailibiltyOfSeat(int seatNo){
		if(this.seats[seatNo - 1]){
			return false;
		}
		else{
			return true;
		}		
	}
	public void showSeats(){
		for(int i = 0;i<120;i++){
			if(this.seats[i]){
				System.out.print(" X ");
			}
			else{
				System.out.print(" "+(i+1)+" ");
			}
			if((i+1)%6 == 0){
				System.out.print("\n");
			}
		}
	}	
}

class Booking{
	ArrayList<Show> showList = new ArrayList<Show>();
	public static Scanner scan = new Scanner(System.in);
	public Ticket bookShow(int showId){
		System.out.println("Number of Seats Availible : " + showList.get(showId - 1).getNoOfSeatsAvailible());
		if(showList.get(showId - 1).getNoOfSeatsAvailible() != 0){
		System.out.println("Enter Number of Seats you want to Book : ");
		int numberOfSeats = scan.nextInt();
		if(numberOfSeats < showList.get(showId - 1).getNoOfSeatsAvailible()){
		int[] listOfSeat = new int[numberOfSeats];
		System.out.println("Enter the Seat Numbers : ");
		for(int i = 0;i < numberOfSeats;i++){
			int seatNumber = scan.nextInt();
			if(showList.get(showId-1).checkAvailibiltyOfSeat(seatNumber)){	
				showList.get(showId-1).bookSeat(seatNumber);
				listOfSeat[i] = seatNumber; 
			}
			else{
				System.out.println("That is Seat is Aldready Booked.\nEnter other Seat number : ");
				i--;
			}			
		}
		Ticket ticket = new Ticket(showList.get(showId - 1).getPrice(),numberOfSeats,showList.get(showId - 1).getTheatreName(),showList.get(showId - 1).getTheatreLocation());
		ticket.setSeatNumber(listOfSeat);
		showList.get(showId - 1).setNoOfSeatsAvailible(numberOfSeats);
		return ticket;
		}	
		else{
			System.out.println("Only "+showList.get(showId - 1).getNoOfSeatsAvailible() + " Availible ");
			}
		}
		else{
			System.out.println("HouseFull.No Seats Availible.");
		}return null;							
	}
	public int getNoOfShow(){
		return this.showList.size();
	}
	public void addNewShow(){
		scan.nextLine();
		System.out.println("Enter Theatre Name : ");
		String theatreName = scan.nextLine();
		System.out.println("Enter Theatre Location : ");
		String theatreLocation = scan.nextLine();
		System.out.println("Enter Film Name : ");
		String fileName = scan.nextLine();
		System.out.println("Enter Show Time : ");
		int showTime = scan.nextInt();
		System.out.println("Enter cost per seat of this show : ");
		int priceperSeat = scan.nextInt();
		Theatre newShow = new Show(showList.size()+1,showTime,fileName,priceperSeat);
		newShow.setTheatreName(theatreName);
		newShow.setTheatreLocation(theatreLocation);
		this.showList.add((Show)newShow);		
	}
	public void diplayShowDetails(){
		for(Show temp : showList){
			System.out.println(temp.getShowId() + "\t" + temp.getFilmName() + "\t" + temp.getShowTime()+"\t"+temp.getTheatreName() + "\t\t"+temp.getTheatreLocation());
		}
	}
	public void displayShowSeats(int showId){
		showList.get(showId - 1).showSeats();
	}	
}

class Ticket{
	int price;
	int numberOfSeatsBooked;
	String bookedSeat;
	String theatreDetails;
	Ticket(int price,int numberOfSeatsBooked,String theatreName,String theatreLocation){
		this.bookedSeat = "";
		this.numberOfSeatsBooked = numberOfSeatsBooked;
		this.price = price * numberOfSeatsBooked; 
		this.theatreDetails = theatreName + ","+theatreLocation;

	}
	public void setSeatNumber(int[] seatNumbers){
		for(int seatNo : seatNumbers){
			this.bookedSeat = this.bookedSeat + " " + seatNo;
		}
	} 
	public void displayTicket(){
		System.out.println("\t\t TICKET\n\t Theatre : "+ this.theatreDetails +"\nNumber Of Seats : " + this.numberOfSeatsBooked + "\tSeat Number : " + this.bookedSeat+"\n\t\tPrice : "+this.price+"\n");
	}	
}
	
class User{
	int userId;
	String phoneNumber;
	Ticket ticket;
	public void setUserId(int userId){
		this.userId = userId;
	}	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber; 
	}
	public void setTicket(Ticket ticket){
		this.ticket = ticket;
	}
	public int getUserId(){
		return this.userId;
	}
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	public Ticket getTicket(){
		return this.ticket;
	}
}

class UserManagement{
	ArrayList<User> userList = new ArrayList<User> (); 
	public void addUser(String phoneNumber){
		User newUser = new User();
		newUser.setUserId(userList.size() + 1 );
		newUser.setPhoneNumber(phoneNumber);
		userList.add(newUser);	
	}
	public void registerNewUser(){
		System.out.println("Enter Your Phone Number : ");
		String phoneNumber = Booking.scan.nextLine();
		if(validatePhoneNumber(phoneNumber)){
			if(checkAlreadyExistPhoneNumber(phoneNumber) < 0){
				addUser(phoneNumber);
				System.out.println("Successfully registered");
			}
			else{
				System.out.println("This Phone Number Already Exist.Login with it");
			}
		}	
		else{
			System.out.println("Invalid Phone Number");
		}
	}
	public int userLogin(String phoneNumber){
		if(checkAlreadyExistPhoneNumber(phoneNumber) > 0){
			System.out.println("Login Successfully");
			return checkAlreadyExistPhoneNumber(phoneNumber);		
		}
		else{
			return -1;
		}
	}
	public boolean validatePhoneNumber(String phoneNumber){
		if(phoneNumber.length() != 10){
			return false;
		}
		for(int i = 0;i < phoneNumber.length();i++){
			if(phoneNumber.charAt(i) >= 48 && phoneNumber.charAt(i) <= 57){
				continue;			
			}
			else{
				return false;
			}
		}
		return true;
	}
	public int checkAlreadyExistPhoneNumber(String phoneNumber){
		for(User temp : userList){
			if(temp.getPhoneNumber().equals(phoneNumber)){
				return temp.getUserId();
			}
		}
		return -1;		
	}
	public void setTicket(int userId,Ticket ticket){
		userList.get(userId - 1).setTicket(ticket);
	}
	public void displayUserTicket(int userId){
		userList.get(userId - 1).getTicket().displayTicket();
	}
}

class TicketBooking{
	public static void main(String args[]){
		boolean flag = true;
		Booking booking = new Booking();
		UserManagement usermanage = new UserManagement();
		Scanner scan = new Scanner(System.in);
		while(flag){
		System.out.println("\t\t1.Book Show\n\t\t2.Admin\n\t\t3.Exit\n");
		int option = Booking.scan.nextInt();
		if(option == 1){
			System.out.println("\t\t1.new User\n\t\t2.login");
			int loginOrregister = Booking.scan.nextInt();
			Booking.scan.nextLine();
			if(loginOrregister == 1){
				usermanage.registerNewUser();
			}
			else if(loginOrregister == 2){
			System.out.print("Enter your Phone Number : ");
			String phoneNumber = Booking.scan.nextLine();
			int userid = usermanage.userLogin(phoneNumber);
			if(userid > 0){
			while(userid > 0){
			System.out.println("\t\t1.Book a Show\n\t\t2.view Ticket\n\t\t3.logout\n");
			int useroption = Booking.scan.nextInt();
			if(useroption == 1){
			System.out.println("option\tMovie\ttimings\tTheatre Name\tTheatre Location");
			booking.diplayShowDetails();
			int showoption = Booking.scan.nextInt();
			if(showoption <= booking.getNoOfShow()){
				booking.displayShowSeats(showoption);
				usermanage.setTicket(userid,booking.bookShow(showoption));
				System.out.println("Ticket Booked");
			}
			else{
				System.out.println("Invalid option");
				}
			}
			else if(useroption == 2){
				usermanage.displayUserTicket(userid);
			}
			else if(useroption == 3){
				userid = -1;
			}
			}
			}
			else{
				System.out.println("Invalid Login");
			}
			}		
		}
		else if(option == 2){
			booking.addNewShow();	
			}
		else if(option == 3){
			flag = false;
			}
		}	
	}
}

