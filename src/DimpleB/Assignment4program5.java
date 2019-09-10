/*
 WAP to check if a number is Armstrong or not
Example:-
input:- 153
output:-153
Hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153
 */

package DimpleB;

import java.util.Scanner;

public class Assignment4program5 {
	void armstrongcheck(int inputnum)
	{
		int rem=0;
		int sum=0;
		int inputnum1=inputnum;
		while(inputnum>0)
		{
			rem=inputnum%10;
			sum=sum+(rem*rem*rem);
			inputnum=inputnum/10;
		}
		if(sum==inputnum1)
			System.out.println("Number "+inputnum1+" is armstrong number");
		else
			System.out.println("Number "+inputnum1+" is not an armstrong number");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		Assignment4program5 p5=new Assignment4program5();
		p5.armstrongcheck(number);
		sc.close();
	}
}
