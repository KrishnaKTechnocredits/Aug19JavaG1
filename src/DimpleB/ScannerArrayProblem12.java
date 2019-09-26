/*Find common number from two different arrays using scanner class*/

package DimpleB;
import java.util.Scanner;

public class ScannerArrayProblem12 {
	void printcommonnumberintwoarrays(int input1[],int input2[])
	{
		int i,j;
		for (i=0;i<input1.length;i++)
		{
			for(j=0;j<input1.length;j++)
			{
				if(input1[i]==input2[j])
				{
					System.out.println("Common number in both arrays is :"+input1[i]);
					break;
				}
			}
		}
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
		ScannerArrayProblem12 arrayProblem12 = new ScannerArrayProblem12();
		arrayProblem12.printcommonnumberintwoarrays(a,b);
	}

}
