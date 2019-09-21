/*
 2)	WAP to find max length String from the given array.
a.	Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}

 */



package VarshaT;

import java.util.Scanner;

public class Program2 {

	void max(String [] arr)
	{
		int count=0;
		String s=null;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>count)
			{
				count=arr[i].length();
				s=arr[i];
			}
		}
		System.out.println("Max length string:"+ s);
	}
	public static void main(String[] args) {
		Program2 program2= new Program2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size= sc.nextInt();
		sc.nextLine();
		String arr[]=new String[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the string");
			arr[i]=sc.nextLine();
		}
		program2.max(arr);
		sc.close();
	}

}
