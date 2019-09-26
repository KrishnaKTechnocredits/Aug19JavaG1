/*Create a class MeetingRoom having method bookMeetingRoom which should provide below facility. 
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh 
a.  “Nalanda” meeting room will be booked with default bookMeetingRoom() method for 1 hr.  
b. Write another method which helps to book Other then “Nalanda” meeting room by giving
 name of meeting room and hrs as parameter. 
 c. displayInfo method should print booked meeting room info [i.e. meeting room, booked for how many hrs].  
*/
package GayatriG;

public class Assignment5Part3Ex1MeetingRoom {
	static String room;
	static int hours;

	Assignment5Part3Ex1MeetingRoom(String bookRoom) {
		// void bookMeetingRoom(String bookRoom){----------------------------------------for methodoverloading
		System.out.println(bookRoom +" meeting room booked for one hour");
	}

	Assignment5Part3Ex1MeetingRoom(String bookRoom, int hrs) {
		// void bookMeetingRoom(String bookRoom, int hrs){--------------------------------for method overloading
		this.room = bookRoom;
		this.hours = hrs;
	}

	static void displayInfo() {
		System.out.println(room + " meeting room booked for " + hours + " hours.");
	}

	public static void main(String[] args) {
		Assignment5Part3Ex1MeetingRoom room = new Assignment5Part3Ex1MeetingRoom("Nalanda");
		Assignment5Part3Ex1MeetingRoom room1 = new Assignment5Part3Ex1MeetingRoom("AgraFort", 5);
		// Assignment5Part3Ex1MeetingRoom room=new Assignment5Part3Ex1MeetingRoom();----------for method overloading
		// room.bookMeetingRoom("Nalanda");---------------------------------------------------for method overloading
		// room.bookMeetingRoom("Agrafort",2);------------------------------------------------for method overloading
		displayInfo();
	}
}
