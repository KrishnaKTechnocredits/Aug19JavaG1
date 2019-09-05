package ShreyaD;

import java.util.Scanner;

public class Assign3_Q13 {

	void armstrong(int num)
	{
		int sum=0;
		int n=0;
		int a=0;
		n=num;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			sum=sum+a*a*a;
		}
		if(n==sum)
		{
			System.out.println("number is armstrong ");
		}else
			System.out.println("number is not armstrong");
	}

public static void main(String []args)
{
	Assign3_Q13 Q13 = new Assign3_Q13();
	Scanner sc  = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	Q13.armstrong(num);
	sc.close();
}
}
