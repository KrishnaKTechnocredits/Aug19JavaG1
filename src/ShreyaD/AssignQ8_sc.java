package ShreyaD;

import java.util.Scanner;

public class AssignQ8_sc {
	void Firstdiffindex(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++)
		{
				if(arr1[i]!=arr2[i])
				{
					System.out.println("Values are not matching at index:"+i);
					break;
			}
		}
	}

	public static void main(String []args)
	{
	 
	   AssignQ8_sc Q8 = new AssignQ8_sc();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no");
		int size = sc.nextInt();
		int size1 = sc.nextInt();
		int num[] = new int[size];
		int num1[] = new int[size1];
		for (int i = 0; i < num.length; i++) {
			System.out.println("enter the number of 1st array:");
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num1.length; i++) {
			System.out.println("enter the number of 2nd array:");
			num1[i] = sc.nextInt();
		}
		sc.close();
	   Q8.Firstdiffindex(num,num1);
}
}
