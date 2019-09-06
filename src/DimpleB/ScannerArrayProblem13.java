/*Print reverse array using scanner class*/

package loopExamples;
import java.util.Scanner;

public class ScannerArrayProblem13 {
	void printarrayinreverse(int input[],int output[])
	{
		int i,index=0;
		for (i=input.length-1;i>=0;i--)
		{
				output[i]=input[i];
				System.out.println("Element in reverse array at index "+index+" is "+output[i]);
				index++;
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
		int revarr[]=new int[arr.length];
		ScannerArrayProblem13 arrayProblem13 = new ScannerArrayProblem13();
		arrayProblem13.printarrayinreverse(arr,revarr);
	}
}
