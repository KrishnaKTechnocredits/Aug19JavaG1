package ShreyaD;

import java.util.Scanner;

public class Assign3_Q9 {

	void avg(int num[])
	{
		int sum=0;
		float avg=0.0f; 
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		avg=sum/num.length;
		System.out.println("the average is "+avg);
	}
	public static void main(String []args)
	{
		Assign3_Q9 Q9 = new Assign3_Q9();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no");
		int size = sc.nextInt();
		int num[] = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("enter the number of 1st array:");
			num[i] = sc.nextInt();
		}
		Q9.avg(num);
		sc.close();
	}
}
