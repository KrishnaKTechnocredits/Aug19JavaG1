/*
 Create a class MeetingRoom having method bookMeetingRoom which should provide below facility.
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
a. “Nalanda” meeting room will be booked with default bookMeetingRoom() method for 1 hr.
b. Write another method which helps to book Other then “Nalanda” meeting room by giving name of meeting room and hrs as parameter.
c. displayInfo method should print booked meeting room info [i.e. meeting room, booked for how many hrs].
 */
package DimpleB;

public class MeetingRoom {

	String meetingroomname="";
	float hours=(float) 0.0;	
	public void bookMeetingRoom()
	{
		this.meetingroomname="Nalanda";
		this.hours=1;
	}
	public void bookMeetingRoom(String meetingroomname,float hours)
	{
		if(meetingroomname!="Nalanda" || meetingroomname!=""||meetingroomname!=null)
		{
			this.meetingroomname=meetingroomname;
			this.hours=hours;
		}		
	}
	public void displayinfo()
	{
		if(meetingroomname!="Nalanda" || meetingroomname!=""||meetingroomname!=null)
		{
			System.out.println("Meeting room "+meetingroomname+" has been booked for "+hours+" hours successfully.");
		}
		else if(meetingroomname!=""||meetingroomname!=null)
			System.out.println("Meeting room "+meetingroomname+" has been booked for "+hours+" hours successfully.");
		else
			System.out.println("Oops..Something went wrong!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeetingRoom m=new MeetingRoom();
		m.bookMeetingRoom();
		m.displayinfo();
		m.bookMeetingRoom("Takshshila", 2);
		m.displayinfo();
		m.bookMeetingRoom("AgraFort", (float) 1.5);
		m.displayinfo();
		m.bookMeetingRoom("PratapGadh", 1);
		m.displayinfo();
	}
}
