/* 1)	WAP which fulfill below condition
a.	WAP to find positive and negative number from the given array  
b.	check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a.	positive number = {5, 6, 14, 6, 7}
b.	negative number = {-9, -25, -14}
c.	positive number sum :- 38
d.	negative number sum :- 48
*/

import java.util.Scanner;

public class StringArrayProblem1 {
	static void printsum(int input[])
	{
		int i,sumpos=0,sumneg=0,negcnt=0,poscnt=0;
		int posarr[]=new int[input.length];
		int negarr[]=new int[input.length];
		for(i=0;i<input.length;i++)
		{
			if(input[i]<0)
			{
				sumneg=sumneg+input[i];
				negarr[i]=input[i];
				poscnt++;
				
			}
			else if(input[i]>0)
			{
				sumpos=sumpos+input[i];
				posarr[i]=input[i];
				negcnt++;
			}
		}
		System.out.println("Sum of positive elements:"+sumpos);
		System.out.println("Sum of negative elements:"+sumneg);
		System.out.println("Positive count:"+poscnt);
		System.out.println("Negative count:"+negcnt);
		System.out.println("Array containing positive elements: ");
		for(i=0;i<posarr.length;i++)
		{
			if(posarr[i]!=0)
				System.out.print(posarr[i]+"   ");
		}
		System.out.println();
		System.out.println("Array containing negative elements: ");
		for(i=0;i<negarr.length;i++)
		{
			if(negarr[i]!=0)
			System.out.print(negarr[i]+"   ");
		}
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
