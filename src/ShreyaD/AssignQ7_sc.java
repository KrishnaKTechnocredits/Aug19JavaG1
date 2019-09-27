package ShreyaD;

import java.util.Scanner;

public class AssignQ7_sc {
 
	void checksum(int arr[],int number)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==number)
				{	
			System.out.println("("+arr[i]+","+arr[j]+")");		
				}
			}
		}
	}
	public static void main(String []args)
	{
		AssignQ7_sc Q7 = new AssignQ7_sc();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no");
		int size = sc.nextInt();
		int num[] = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("enter the number of 1st array:");
			num[i] = sc.nextInt();
		}
		System.out.println("please enter the sum");
		int sum = sc.nextInt();
		System.out.println("sum:"+sum);
		Q7.checksum(num,sum);
		sc.close();
	}

}
