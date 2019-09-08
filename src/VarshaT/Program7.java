/*
 7)	WAP to find factorial for user defined number
a.	Input number :- 5
b.	Output :- 120

 */

package VarshaT;

import java.util.Scanner;

public class Program7 {
	void factorial(int num)
	{
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("factorial: "+fact);
	}

	public static void main(String[] args) {
		Program7 program7= new Program7();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int num= sc.nextInt();
		program7.factorial(num);
		sc.close();
	}

}
