/*Print even number from an array using scanner class*/

package loopExamples;
import java.util.Scanner;

public class ScannerArrayProblem14 {
	void printevenelements(int input[],int output[])
	{
		int i,index=0;
		for (i=0;i<input.length;i++)
		{
				if(input[i]%2==0)
				{
					output[i]=input[i];
					System.out.println("Element "+output[i]+" at index "+index+" is even");
					index++;
				}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of elements for array:");
		int size=sc.nextInt();
		System.out.println(size);
		int[] arr=new int[size];
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Please enter next element for array:");
			arr[i]=sc.nextInt();
		}
		int evenarr[]=new int[arr.length];
		ScannerArrayProblem14 arrayproblem14 = new ScannerArrayProblem14();
		arrayproblem14.printevenelements(arr,evenarr);
	}
}
