/*WAP to print below output-
 Input:electrical engineee
Output:Frequency of character e in given string is: 6
 */
package DimpleB;

import java.util.Scanner;

public class Assignment4program16 {
	void frequencycheck(String str)
	{
		String arr[]=str.split(" ");
		int i=0;
		int j=0;
		int count=0;
		char ch='e';
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length();j++)
			{
				if(arr[i].charAt(j)==ch)
				count++;
			}
		}
		System.out.println("Frequency of character "+ch+" in given string is: "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter string:");
		Scanner sc=new Scanner(System.in);
		String strip=sc.nextLine();
		Assignment4program16 p16=new Assignment4program16();
		p16.frequencycheck(strip);
		sc.close();
	}

}
