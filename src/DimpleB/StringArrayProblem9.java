package DimpleB;

/* 9)	WAP to find average of user given array
a.	Input :- {14, 32, 19, 14, 78,36}
b.	Output:- 32.16
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class StringArrayProblem9 {
	static void printsum(int input[])
	{
		int i,numcount=0;
		float sum=0;
		float avg;
		for(i=0;i<input.length;i++)
		{
			sum=sum+input[i];
			numcount++;
		}
		avg=sum/numcount;
		System.out.println("Average of elements in given array is  :");
		DecimalFormat d=new DecimalFormat("#.##") ;
		String formatnew =d.format(avg);
		System.out.print(formatnew);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of elements for array:");
		int size=sc.nextInt();
		System.out.println(size);
		int[] a=new int[size];
		for(i=0;i<a.length;i++)
		{
			System.out.println("Please enter next element for array:");
			a[i]=sc.nextInt();
		}
		sc.close();
		printsum(a);
	}

}
