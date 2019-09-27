package coreJavaAssignment3.UsingOverloading;

public class MeetingRoom {
	
	void bookMeetingRoom()
	{
		System.out.println("Nalanda meeting room booked for 1hr");
	}
	
	void bookMeetingRoom(String str, int hr)
	{
		if (str.equals("Takshashila"))
			displayInfo(str, hr);
		else if (str.equals("AgraFort"))
			displayInfo(str, hr);
		else if (str.equals("PratapGadh"))
			displayInfo(str, hr);
	}
	
	void displayInfo(String room, int hr)
	{
		System.out.println(room +" meeting room booked for " +hr);
	}
}
