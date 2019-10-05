//WAP that keeps no. from user and generates integer between 1& 7 and displays name of the weekdays

package VarshaT;

import java.util.Scanner;

public class A5_P5 {
	int x;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day:");
		 x= sc.nextInt();
		 if(x>7)
		 {
			 x=x%7+1;
		 }
		 sc.close();
	}
	
	String calender(int x) {
		String res = "";
		switch (x) {
		case 1:
			res = "Monday";
			break;
		case 2:
			res = "Tuesday";
			break;
		case 3:
			res = "Wednesday";
			break;

		case 4:
			res = "Thursday";
			break;
		case 5:
			res = "Friday";
			break;

		case 6:
			res = "Saturday";
			break;
		case 7:
			res = "Sunday";
			break;

		default:
			res = "Oops!! ERROR, Retry";
			break;
		}
		return res;
	}

	public static void main(String[] args) {
		A5_P5 a5_P5 = new A5_P5();
		a5_P5.input();
		System.out.println(a5_P5.calender(a5_P5.x));

	}

}
