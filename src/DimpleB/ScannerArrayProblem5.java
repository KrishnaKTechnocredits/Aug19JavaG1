/*Find Second largest number from an unsorted array using scanner class*/

package loopExamples;
import java.util.Scanner;

public class ScannerArrayProblem5 {
	void findsecondlargest(int input[])
	{
		int i,max,secmax;
		max=input[0];
		secmax=0;
		for (i=0;i<input.length;i++)
		{
				
				if(input[i]>max)
				{
					secmax=max;
					max=input[i];

				}
				else if(input[i]>secmax && max>input[i])
				{
					secmax=input[i];
					
				}
			}
		
		System.out.println("Second largest element in given unsorted array is "+secmax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of elements:");
		int size=sc.nextInt();
		System.out.println(size);
		int[] a=new int[size];
		for(i=0;i<a.length;i++)
		{
			System.out.println("Please enter next element:");
			a[i]=sc.nextInt();
		}
		ScannerArrayProblem5 arrayproblem5 = new ScannerArrayProblem5();
		arrayproblem5.findsecondlargest(a);
	}


}
