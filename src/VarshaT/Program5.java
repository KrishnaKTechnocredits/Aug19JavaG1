/*
 5)	WAP to reveres user given number
a.	Input number:- 456789
b.	Output number :- 987654

 */
package VarshaT;

import java.util.Scanner;

public class Program5 {
	void reverse(int num)
	{
		int x=0,sum=0;
		while(num>0)
		{
			x=num%10;
			num/=10;
			sum=sum*10+x;
		}
		System.out.println("reverse number: "+sum);
		
	}

	public static void main(String[] args) {
		Program5 program5= new Program5();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		program5.reverse(num);
		sc.close();

	}

}
