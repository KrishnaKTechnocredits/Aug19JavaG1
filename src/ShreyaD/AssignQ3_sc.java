package ShreyaD;

import java.util.Scanner;

public class AssignQ3_sc {
	void check(int arr[], int number)
	{    int cnt = 0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==number)
			{
				cnt++;
				break;
			}
		}
		if(cnt>0)
			System.out.println("number is in array");
		else
			System.out.println("number is not in array");
	}
	public static void main(String []args)
	{
		
		AssignQ3_sc Q3 = new  AssignQ3_sc();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no");
		int size = sc.nextInt();
		int num[] = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("enter the number of 1st array:");
			num[i] = sc.nextInt();
		}
		System.out.println("please enter the no:");
		int size1 = sc.nextInt();
		System.out.println("number:"+size1);
		int number = sc.nextInt();
		 Q3.check(num,number);
		 sc.close();
	}
}
