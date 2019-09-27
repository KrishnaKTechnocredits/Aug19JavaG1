package coreJavaAssignment3.UsingOverloading;

import java.util.Scanner;

public class ClientBookMeetingRoom extends MeetingRoom{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter meeting room name");
		String str = sc.next();
		System.out.println("Entered name is: " +str);
		MeetingRoom mr = new ClientBookMeetingRoom();
		
		if (str.equals("Nalanda"))
			mr.bookMeetingRoom();
		
		else if (str.equals("Takshashila"))
		{
			System.out.println("Please enter how much time booked");
			int hr = sc.nextInt();
			mr.bookMeetingRoom(str, hr);
		}
		
		else if (str.equals("AgraFort"))
		{
			System.out.println("Please enter how much time booked");
			int hr = sc.nextInt();
			System.out.println("Time entere is: " +hr);
			mr.bookMeetingRoom(str, hr);
		}
		else if (str.equals("PratapGadh"))
		{
			System.out.println("Please enter how much time booked");
			int hr = sc.nextInt();
			mr.bookMeetingRoom(str, hr);
		}
		sc.close();
	}
}
