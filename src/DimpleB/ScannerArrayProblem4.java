
/* Find largest and smallest number from an unsorted array using scanner class*/

package DimpleB;
import java.util.Scanner;

public class ScannerArrayProblem4 {
	void findlargestsmallest(int input[])
	{
		int i,largest=input[0],smallest=input[0];
		for (i=0;i<input.length;i++)
		{
			if(input[i]>largest)
			{
				largest=input[i];
			}
			if(input[i]<smallest)
			{
				smallest=input[i];
			}

		}
		System.out.println("Largest number in given unsorted array is :"+largest);
		System.out.println("Smallest number in given unsorted array is :"+smallest);
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
		ScannerArrayProblem4 arrayproblem4 = new ScannerArrayProblem4();
		arrayproblem4.findlargestsmallest(a);
	}


}
