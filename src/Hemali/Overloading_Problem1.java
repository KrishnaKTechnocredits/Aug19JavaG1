package Hemali;

public class Overloading_Problem1 {
	
	String meetingroomName;
	int hrs;

	void bookmeetingRoom()
	{
		this.bookmeetingRoom("Nalanda",1);
	}
	
	void bookmeetingRoom(String meetingroomName,int hrs )
	{
		this.meetingroomName=meetingroomName;
		this.hrs=hrs;
	}
	
	void displayInfo()
	{
		System.out.println("Meeing room name is " +meetingroomName+ " and hrs is "+hrs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading_Problem1 prob1=new Overloading_Problem1();
		prob1.bookmeetingRoom();
		prob1.displayInfo();
		prob1.bookmeetingRoom("Agrafort",3);
		prob1.displayInfo();
	}

}
