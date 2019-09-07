/*Find maximum value at differed index from an unsorted array using scanner class*/

package  DimpleB;
import java.util.Scanner;

public class ScannerArrayProblem10 {
	
	void maxdifferedelement(int input1[],int input2[])
	{
		int i;
		for (i=0;i<input1.length;i++)
		{
			if(input1[i]!=input2[i])																																																
			{
				if(input1[i]>input2[i])
				{
					System.out.println("Maximum between differed elements  is : "+input1[i]);
					break;
				}
				System.out.println("Maximum between differed elements  is : "+input2[i]);
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
		ScannerArrayProblem10 arrayproblem10 = new ScannerArrayProblem10();
		arrayproblem10.maxdifferedelement(a, b);
	}

}
