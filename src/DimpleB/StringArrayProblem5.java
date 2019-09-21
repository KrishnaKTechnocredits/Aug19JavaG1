/*5)	WAP to reveres user given number
a.	Input number:- 456789
b.	Output number :- 987654
*/
package DimpleB;
import java.util.Scanner;

public class StringArrayProblem5 {
	
	void reversenum(String str)
	{
		int i=0;
		String revstr="";
		String str2="";
		for(i=str.length()-1;i>=0;i--)
		{
			revstr=str.valueOf(str.charAt(i));
			str2=str2.concat(revstr);
		}
		int num=Integer.parseInt(str2);
		System.out.println("Number after reversal is "+num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		String strip=sc.next();
		sc.close();
		StringArrayProblem5 arrpro5=new StringArrayProblem5();
		arrpro5.reversenum(strip);
		
	}
}
