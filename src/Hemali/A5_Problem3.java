package Hemali;

public class A5_Problem3 {
	
	void leapYear(int year){
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println(" year is a leap year");
	      else
	         System.out.println(" year is not a leap year");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5_Problem3 prob3=new A5_Problem3();
		prob3.leapYear(2017);
	}

}
