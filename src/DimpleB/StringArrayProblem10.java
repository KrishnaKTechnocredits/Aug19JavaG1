/* 10)	WAP to sum of two array
a.	firstArray :- {1, 5, 9, 3, 7}
b.	secondAraay:- {1, 7,  9, 3}
	*/

import java.util.Scanner;
public class StringArrayProblem10 {

	void printsumoftwoarrays(int input1[],int input2[])
	{
		int i,sum1=0,sum2=0,finalsum=0;
		for(i=0;i<input1.length;i++)
		{
			sum1=sum1+input1[i];
		}
		for(i=0;i<input2.length;i++)
		{
			sum2=sum2+input2[i];
		}
		finalsum=sum1+sum2;
		System.out.println("Sum of elements of user defined arrays is :"+finalsum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of elements for array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(i=0;i<a.length;i++)
		{
			System.out.println("Please enter next element for array:");
			a[i]=sc.nextInt();
		}
		System.out.println("Please enter number of elements for array:");
		int size1=sc.nextInt();
		int[] b=new int[size1];
		for(i=0;i<b.length;i++)
		{
			System.out.println("Please enter next element for array:");
			b[i]=sc.nextInt();
		}
		sc.close();
		StringArrayProblem10 strprob10=new StringArrayProblem10();
		strprob10.printsumoftwoarrays(a, b);
	}

}

