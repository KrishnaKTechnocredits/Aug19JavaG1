/*Find unique number from two different arrays using scanner class*/

package loopExamples;
import java.util.Scanner;

public class ScannerArrayProblem11 {
	static int index = 0;
	 int[] printuniqueelements(int input1[],int input2[],int output[])
	{
		int i,j;
		for(i=0;i<input1.length;i++)
		{
			boolean flag=false;
			for(j=0;j<index;j++)
			{
				if(input1[i]==output[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				output[index]=input1[i];
				index++;
			}
			
		}
		
		for(i=0;i<input2.length;i++)
		{
			boolean flag=false;
			for(j=0;j<index;j++)
			{
				if(input2[i]==output[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				output[index]=input2[i];
				index++;
			}
			
		}
		return output;
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
		int temp[]=new int[a.length+b.length];
		ScannerArrayProblem11 arrayProblem12 = new ScannerArrayProblem11();
		int outputarr[]=arrayProblem12.printuniqueelements(a,b,temp);
		System.out.println("Unique elements from both arrays are:");
		for(i=0;i<index;i++)
		{
				System.out.println(outputarr[i]);
		}
	}

}
