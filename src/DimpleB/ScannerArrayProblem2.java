/*find duplicate number in an integer array using scanner class*/

package loopExamples;
import java.util.Scanner;

public class ScannerArrayProblem2 {
	void findDuplicateNum(int input[])
	{
		int i,j;
		for (i=0;i<input.length;i++)
		{
			for(j=i+1;j<input.length;j++)
			{
				if(input[i]==input[j])
					System.out.println("Number "+input[i]+" is duplicate in given array");
			}
		}
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
		ScannerArrayProblem2 arrayproblem2 = new ScannerArrayProblem2();
		arrayproblem2.findDuplicateNum(a);
	}

}
