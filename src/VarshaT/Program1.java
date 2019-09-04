package VarshaT;

import java.util.Scanner;

public class Program1 {
	void finder(int a[])
	{
		int p_sum=0,n_sum=0,p_count=0,n_count=0;
		int p_arr[]=new int[a.length];
		int n_arr[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				n_arr[n_count++]=a[i];
				n_sum+=a[i];
			}
			else
			{
				p_arr[p_count++]=a[i];
				p_sum+=a[i];
			}
		}
		System.out.print("positive numbers:");
		for(int i=0;i<p_count;i++)
			System.out.print(p_arr[i]+" ");
		System.out.println();
		System.out.print("negative numbers:");
		for(int i=0;i<n_count;i++)
			System.out.print(n_arr[i]+" ");
		System.out.println();
		System.out.println("positive numbers sum:"+p_sum);
		System.out.println("negative numbers sum:"+n_sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 program1= new Program1();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size= sc.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the element:");
			arr[i]=sc.nextInt();
		}
		program1.finder(arr);
		sc.close();

	}

}
