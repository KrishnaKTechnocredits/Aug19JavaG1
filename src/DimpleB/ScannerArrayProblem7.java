/*Find all the pairs in an integer array whose sum is equal to given number using scanner class*/

package loopExamples;
import java.util.Scanner;

public class ScannerArrayProblem7 {
	void sumofpairequalnumber(int input[],int number)
	{
		int i,j;
		for (i=0;i<input.length;i++)
		{
			for(j=i+1;j<input.length;j++)
			{
				if(input[i]+input[j]==number)
				{
					System.out.println("Sum of two elements of  "+input[i]+" and "+input[j]+" is = "+number);
				}
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
		System.out.println("Please enter number for which sum of pair of elements in array equals:");
		int num=sc.nextInt();
		ScannerArrayProblem7 arrayproblem7 = new ScannerArrayProblem7();
		arrayproblem7.sumofpairequalnumber(a,num);
	}

}
