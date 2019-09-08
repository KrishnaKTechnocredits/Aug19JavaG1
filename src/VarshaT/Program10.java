/*
 10)	WAP to sum of two array
a.	firstArray :- {1, 5, 9, 3, 7}
b.	secondAraay:- {1, 7,  9, 3}
c.	output :- 45

 */

package VarshaT;

import java.util.Scanner;

public class Program10 {
	void sum(int arr[], int arr1[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		for(int i=0;i<arr1.length;i++)
		{
			sum+=arr1[i];
		}
		System.out.println("sum="+sum);
	}

	public static void main(String[] args) {
		Program10 program10= new Program10();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of first array:");
		int size= sc.nextInt();
		System.out.println("enter size of second array:");
		int size1= sc.nextInt();
		int arr[]= new int[size];
		int arr1[]= new int[size1];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter element of array1:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size1;i++)
		{
			System.out.println("enter element of array2:");
			arr1[i]=sc.nextInt();
		}
		
		program10.sum(arr, arr1);
		sc.close();
	}

}
