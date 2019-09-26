/*
 14)	WAP to find unique number from given array store that numbers in new array. 
a.	firstArray:- {1,2,3,4,2,5}
b.	secondArray:- {5,6,7,8,9,7}
c.	unique array = {1,2,3,4,5,6,7,8,9}
i.	order can be anything 

 */
package VarshaT;

import java.util.Scanner;

public class Program14 {

	void unique(int arr[], int arr1[])
	{
		int u_arr[]= new int[arr.length+arr1.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			Boolean flag= false;
			for(int j=0;j<u_arr.length;j++)
			{
				if(arr[i]==u_arr[j])
					flag=true;
			}
			if(flag==false)
				u_arr[k++]=arr[i];
				
		}
		for(int i=0;i<arr1.length;i++)
		{
			Boolean flag= false;
			for(int j=0;j<u_arr.length;j++)
			{
				if(arr1[i]==u_arr[j])
					flag=true;
			}
			if(flag==false)
				u_arr[k++]=arr1[i];
				
		}
		for(int i=0;i<k;i++)
		{
			System.out.println(u_arr[i]);
		}
	}
	public static void main(String[] args) {
		Program14 program14= new Program14();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of first array:");
		int size= sc.nextInt();
		System.out.println("enter the size of second array:");
		int size1= sc.nextInt();
		int arr[]= new int[size];
		int arr1[]= new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter element of first array:");
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<size1;i++)
		{
			System.out.println("enter element of second array:");
			arr1[i]= sc.nextInt();
		}
		program14.unique(arr, arr1);
		sc.close();

	}

}
