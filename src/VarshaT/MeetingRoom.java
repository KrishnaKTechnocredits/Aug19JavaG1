/*
Create a class MeetingRoom having method bookMeetingRoom which should provide below facility. 
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh 
a.  “Nalanda” meeting room will be booked with default bookMeetingRoom() method for 1 hr. 
b. Write another method which helps to book Other then “Nalanda” meeting room by giving name of meeting room and hrs 
as parameter. 
c. displayInfo method should print booked meeting room info [i.e. meeting room, booked for how many hrs
 */
package VarshaT;

public class MeetingRoom {
	private String name;
	private int hour;
	void bookMeetingRoom()
	{
		name="Nalanda";
		hour=1;
	}
	void bookMeetingRoom(String name,int hour)
	{
		this.name=name;
		this.hour=hour;
	}
	
	void displayInfo()
	{
		System.out.println("MEETING ROOM "+ name+" is booked for "+hour+ " hours");
	}
	public static void main(String[] args) {
		MeetingRoom meetingRoom= new MeetingRoom();
		meetingRoom.bookMeetingRoom();
		meetingRoom.displayInfo();
		meetingRoom.bookMeetingRoom("Takshashila", 5);
		meetingRoom.displayInfo();

	}

}
