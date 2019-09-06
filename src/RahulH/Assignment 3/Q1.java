package assignment_4;

import java.util.Scanner;

public class Q1 {
	
	//int a[] = {5, 6, -9, 14, -25, 6, 7, -14};
	//int p[] = new int[a.length];
	int positivesum = 0;
	int negativesum = 0;
	
	void positiveNegative(int num[])
	{
		for (int i = 0; i<num.length; i++)
		{
			if (num[i]> 0)
			{
				System.out.print(num[i] + " ");
				positivesum = positivesum + num[i];
			}
		}
		System.out.println();
		System.out.println("The postive sum is: " +positivesum);
		
		for (int i=0; i<num.length; i++)
		{
			if (num[i]<0)
			{
				System.out.print(num[i] + " ");
				negativesum = negativesum + num[i];
			}
		}
		System.out.println();
		System.out.println("The negative sum is: " +negativesum);
	}
	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the size: ");
		int size = sc.nextInt();
		System.out.println("Entered size is: " +size);
		
		int num[] = new int[size];
		
		for(int i=0; i<num.length; i++)
		{
			System.out.println("Please enter " + (i+1) + " number");
			num[i] = sc.nextInt();
		}
		
		new Q1().positiveNegative(num);
		sc.close();
	}

}