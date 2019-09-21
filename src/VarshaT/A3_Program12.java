/*
 * 12) WAP to separate numeric and string value from the array Example:- Hint:- go with contains 0 to 9  
 * input:- String array[] = {"xyz", "77", "101", "99", "abc”}  
 * output:- numeric → 77, 101, 99      string →xyz, abc 
 */


package VarshaT;

import java.util.Scanner;

public class A3_Program12 {

	void seperate(String s[])
	{
		String s1[]=new String[s.length];
		int int_arr[]= new int[s.length];
		int k=0,l=0;
		for(int i=0;i<s.length;i++)
		{
			int count=0;
			for(int j=0;j<10;j++)
			{
				if(s[i].contains(""+j))
				{
					count=1;
					int_arr[k++]=Integer.parseInt(s[i]);
					break;
				}
				
			}
			if(count==0)
				s1[l++]=s[i];
		}
		System.out.println("Numeric values: ");
		for(int i=0;i<k;i++)
		{
			System.out.print(int_arr[i]+" ");
		}
		System.out.println();
		System.out.println("String values:  ");
		for(int i=0;i<l;i++)
		{
			System.out.print(s1[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		A3_Program12 a3_Program12= new A3_Program12();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int size= sc.nextInt();
		String s[]= new String[size];
		for(int i=0;i<size;i++)
			s[i]=sc.next();
		a3_Program12.seperate(s);
		sc.close();
		
	}

}
