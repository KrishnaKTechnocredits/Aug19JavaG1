package RahulH.Assignment_3;

import java.util.Scanner;

public class Q14 {
	
	void unique(int c[])
	{
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 1 array");
		int size = sc.nextInt();
		System.out.println("Please enter the array size 1");
		
		int c[] = new int[size];
		
		for (int i=0; i<c.length; i++)
		{
			System.out.println("Please enter the arry numer" + (i+1) + ":");
		}
		
		new Q14().unique(c);
	}

}
