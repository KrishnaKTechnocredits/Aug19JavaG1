
/*find missing number in integer array of 1 to 10 using scanner class*/

package DimpleB;
import java.util.Scanner;

public class ScannerArrayProblem1 {
		void findMissingNum(int input[],int number)
		{
			int i,j;
			for (i=0;i<input.length;i++)
			{
				j=i+1;
				if(j!=input[i])
				{
					System.out.println("Number "+j+"  is missing in given array");
					break;
				}
			}
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
			ScannerArrayProblem1 arrayproblem1 = new ScannerArrayProblem1();
			arrayproblem1.findMissingNum(a,num);
		}


}
