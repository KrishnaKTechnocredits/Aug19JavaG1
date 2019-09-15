/*WAP to print sum of digit(Consider Input as Integer not as String)
Example:-
input:- 12345
output:- 15 */

package DimpleB;

import java.util.Scanner;

public class Assignment4program7 {

	void sumofdigitsofnum(int inputnum)
	{
		int rem=0;
		int sum=0;
		int inputnum1=inputnum;
		while(inputnum>0)
		{
			rem=inputnum%10;
			sum=sum+rem;
			inputnum=inputnum/10;
		}
		System.out.println("Sum of digits of a number "+inputnum1+" is "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		Assignment4program7 p7=new Assignment4program7();
		p7.sumofdigitsofnum(number);
		sc.close();
	}

}
