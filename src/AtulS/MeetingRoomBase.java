//Create a class MeetingRoom having method bookMeetingRoom which should provide below facility
package AtulS;

public class MeetingRoomBase {
	String room;
	int hours;

	void bookMeetingRoom() {
		room = "Nalanda";
		hours = 1;
		System.out.println(room + ":" + hours);
	}

	void bookMeetingRoom(String room, int hours) {
		this.room = room;
		this.hours = hours;
		System.out.println(room + ":" + hours);
	}

	public static void main(String[] args) {
		MeetingRoomBase obj = new MeetingRoomBase();
		obj.bookMeetingRoom();
		obj.bookMeetingRoom("Agra", 5);
	}
}
