package assignment_4;

import java.util.Scanner;

public class Q9 {
	
	float sum;
	
	void average(int input[])
	{
		for (int i=0; i<input.length; i++)
		{
			sum = sum + input[i];
		}
		System.out.println("The average is: " +sum/input.length);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of string: ");
		int size = sc.nextInt();
		System.out.println("Array size is: " +size);
		
		int input[] = new int[size];
		
		for (int i=0; i<input.length; i++)
		{
			System.out.println("Please enter " + (i+1) + " number");
			input[i]=sc.nextInt();
		}
		
		new Q9().average(input);
		sc.close();
	}

}
