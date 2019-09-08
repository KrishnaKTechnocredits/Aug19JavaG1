
/*Check equality of two arrays using scanner class*/
package loopExamples;

import java.util.Scanner;

public class ScannerArrayProblem6 {
	void arrayequality(int input1[],int input2[])
	{
		int i,flag=0;
		if(input1.length==input2.length)
		{
			for (i=0;i<input1.length;i++)
			{
				if(input1[i]!=input2[i])
				{
					flag=1;
					System.out.println("Given arrays are not equal.");
					break;
				}
			}
			if(flag==0)
			System.out.println("Given arrays are equal.");
		}
		else
			System.out.println("Array length mismatch");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of elements for first array:");
		int size=sc.nextInt();
		System.out.println(size);
		int[] a=new int[size];
		for(i=0;i<a.length;i++)
		{
			System.out.println("Please enter next element for first array:");
			a[i]=sc.nextInt();
		}
		System.out.println("Please enter number of elements for second array:");
		int size1=sc.nextInt();
		System.out.println(size);
		int[] b=new int[size1];
		for(i=0;i<b.length;i++)
		{
			System.out.println("Please enter next element for second array:");
			b[i]=sc.nextInt();
		}
		
		ScannerArrayProblem6 arrayproblem6 = new ScannerArrayProblem6();
		arrayproblem6.arrayequality(a,b);
	}
}
