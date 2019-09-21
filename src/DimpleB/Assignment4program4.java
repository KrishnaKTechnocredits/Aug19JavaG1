/*
 WAP to reverse number (Consider Input as Integer not as String).
Example:-
input:- 12345
output:- 54321
 */
package DimpleB;

import java.util.Scanner;

public class Assignment4program4 {

	void reversenumber(int inputnum)
	{
		int rem=0;
		int sum=0;
		while(inputnum>0)
		{
			rem=inputnum%10;
			sum=(sum*10)+rem;
			inputnum=inputnum/10;
			
		}
		System.out.println("Number after reversal is: "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		Assignment4program4 p4=new Assignment4program4();
		p4.reversenumber(number);
		sc.close();
	}

}
