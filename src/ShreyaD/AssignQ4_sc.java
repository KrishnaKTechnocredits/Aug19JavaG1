package ShreyaD;

import java.util.Scanner;

public class AssignQ4_sc {

	void check(int arr[],int sum)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{	
			System.out.println("("+arr[i]+","+arr[j]+")");		
				}
			}
		}
	}
	public static void main(String []args)
	{
		AssignQ4_sc Q4 = new  AssignQ4_sc();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no");
		int size = sc.nextInt();
		int num[] = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("enter the number of 1st array:");
			num[i] = sc.nextInt();
		}
		System.out.println("please enter the sum:");
		int sum = sc.nextInt();
		 Q4.check(num,sum);
		 sc.close();
	}
}
