package ShreyaD;

import java.util.Scanner;

public class AssignQ13_sc {

	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no");
		int size = sc.nextInt();
		int num[] = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("enter the number of 1st array:");
			num[i] = sc.nextInt();
		}
		System.out.print("Array is:");
		for (int i=0;i<num.length;i++)
		{
			
			System.out.print(num[i]+" ");
		}
		System.out.println(" ");
		System.out.print("Array in reverse order:");
		for(int j=num.length-1;j>=0;j--)
		{
			
			System.out.print(num[j]+" ");
		}
		sc.close();	
		
	}
}