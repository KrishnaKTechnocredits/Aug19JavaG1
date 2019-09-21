/*Check if an array contains given number using scanner class*/

package DimpleB;
import java.util.Scanner;

public class ScannerArrayProblem3 {
	void findMissingNum(int input[],int number)
	{
		int i,flag=0;
		for (i=0;i<input.length;i++)
		{
			flag=0;
			if(input[i]==number)
			{
				flag=1;
				System.out.println("Array contains given number "+number);	
				break;
			}
		}
		if(flag==0)
			System.out.println("Array does not contain given number "+number);
	}
	public static void main(String[] args) 
	{
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
		System.out.println("Please enter number to be checked in an array:");
		int num=sc.nextInt();
		ScannerArrayProblem3 arrayproblem3 = new ScannerArrayProblem3();
		arrayproblem3.findMissingNum(a,num);
	}

}
