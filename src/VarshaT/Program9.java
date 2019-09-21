/*
 9)	WAP to find average of user given array
a.	Input :- {14, 32, 19, 14, 78,36}
b.	Output:- 32.16

 */

package VarshaT;

import java.util.Scanner;

public class Program9 {

	void avg(int arr[])
	{
		float av=0.0f;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		av=(float)sum/arr.length;
		System.out.println("average="+av);
	}
	public static void main(String[] args) {
		Program9 program9 =new Program9();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size= sc.nextInt();
		int arr[]= new int[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("enter element:");
			arr[i]=sc.nextInt();
			
		}
		program9.avg(arr);
		sc.close();
	}

}
