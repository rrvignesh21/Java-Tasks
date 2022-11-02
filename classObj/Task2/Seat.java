//package TicketBooking;
import java.util.*;
class Show{
	Boolean[] seats = new Boolean[120];
	int noOfSeatsAvailible;
	int showTime;
	String filmName;
	Show(int showTime,String filmName){
		Arrays.fill(this.seats,Boolean.FALSE);
		this.noOfSeatsAvailible = 120;
		this.showTime = showTime;
		this.filmName = filmName;		
	}
	public int getShowTime(){
		return this.showTime;
	}
	public String filmName(){
		return this.filmName;
	}
	public void setNoOfSeatsAvailible(int noOfSeats){
		this.noOfSeatsAvailible -= noOfSeats;
	}
	public void bookTheSeat(int seatNo){
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

class Q5{

	
}

