

class Rectangle{

	private int breadth,width;
	Rectangle(int breadth,int width){
		this.breadth = breadth;
		this.width = width;
	}
	public int area(){
		return (this.width * this.breadth);
	}
}

class Q2{

	public static void main(String args[]){
		Rectangle rectangle1 = new Rectangle(4,5);
		Rectangle rectangle2 = new Rectangle(5,8);
		System.out.println("Area of rectangle 1 : "+rectangle1.area()+"\nArea of rectangle 2 : "+rectangle2.area());
	}
}