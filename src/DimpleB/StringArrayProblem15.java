
/* 15)	WAP to find string which has length more than 7 characheter.
a.	Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”}
b.	Output :- Krishna, aakansha, abhishek
*/
import java.util.Scanner;
public class StringArrayProblem15 {
	
	void printgivenlenstr(String inputstr[],int strlen)
	{
		int i=0;
		for(i=0;i<inputstr.length;i++)
		{
			if(inputstr[i].length()>strlen)
			{
				System.out.println("The string with length"+strlen+" more than given length is :"+inputstr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of string elements for array:");
		int size=sc.nextInt();
		System.out.println(size);
		String[] a=new String[size];
		for(i=0;i<a.length;i++)
		{
			System.out.println("Please enter next string for array:");
			a[i]=sc.next();
		}
		sc.close();
		StringArrayProblem15 strmax=new StringArrayProblem15();
		strmax.printgivenlenstr(a,size);
	}

}
