/*WAP to separate numeric and string value from the array
Example:-
input: String array[] = {"xyz", "77", "101", "99", "abc”}
output: (numeric) 77, 101, 99
string:-xyz, abc
 */
package assignment4;
public class Assignment4program12 {
	void seperatenumericalpha(String inputnum[])
	{
		int i=0;
		int j=0;
		int index=0;
		String outputarrnumeric[]=new String[inputnum.length];
		String outputarralpha[]=new String[inputnum.length];
		for(i=0;i<inputnum.length;i++)
		{
			for(j=0;j<inputnum[i].length();j++)
			{
				if(Character.isAlphabetic(inputnum[i].charAt(j)))
				{
					outputarralpha[i]=inputnum[i];
				}
				else
				{
					outputarrnumeric[i]=inputnum[i];
				}
			}
		}
		System.out.println("Numeric output array is :");
		for(index=0;index<outputarrnumeric.length;index++)
		{
			if(outputarrnumeric[index]!=null)
				System.out.print(outputarrnumeric[index]+ " ");
			
		}
		System.out.println();
		System.out.println("Alphabetic output array is :");
		for(index=0;index<outputarralpha.length;index++)
		{
			if(outputarralpha[index]!=null)
				System.out.print(outputarralpha[index]+ " ");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]={"xyz","77","101","99","abc"};
		Assignment4program12 p12=new Assignment4program12();
		p12.seperatenumericalpha(arr);
	}
}
