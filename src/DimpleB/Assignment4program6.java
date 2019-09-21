/*WAP to print factorial number
Example:-
input:- 5
output:- 120
hint:- 1*2*3*4*5=120 */

package DimpleB;

import java.util.Scanner;

public class Assignment4program6 {

	void printfactorial(int inputnum)
	{
		int i=0;
		int fact=1;
		for(i=1;i<inputnum;i++)
			fact=fact+(fact*i);
		System.out.println("Factorial of given number "+inputnum+" is: "+fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		Assignment4program6 p6=new Assignment4program6();
		p6.printfactorial(number);
		sc.close();
	}

}
