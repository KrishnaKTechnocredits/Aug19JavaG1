/*
 15)	WAP to find string which has length more than 7 characheter.
a.	Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”}\
b.	Output :- Krishna, aakansha, abhishek

 */


package VarshaT;

import java.util.Scanner;

public class Program15 {

	void filter(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>=7)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		Program15 program15= new Program15();
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
		program15.filter(arr);
		sc.close();
	}

}
