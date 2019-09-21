/*14)	WAP to find unique number from given array store that numbers in new array. 
a.	firstArray:- {1,2,3,4,2,5}
b.	secondArray:- {5,6,7,8,9,7}
c.	unique array = {1,2,3,4,5,6,7,8,9}
i.	order can be anything
*/
package DimpleB;
import java.util.Scanner;

public class StringArrayProblem14 {
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
		sc.close();
		int temp[]=new int[a.length+b.length];
		StringArrayProblem14 strarraypro14 = new StringArrayProblem14();
		int outputarr[]=strarraypro14.printuniqueelements(a,b,temp);
		System.out.println("Unique elements from both arrays are:");
		for(i=0;i<index;i++)
		{
				System.out.println(outputarr[i]);
		}
	}

}
