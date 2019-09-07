/* 4)	WAP to find sum of user given number.
a.	Input:- 159753
b.	Sum of given number:- 30
*/
package DimpleB;
import java.util.Scanner;

public class StringArrayProblem4 {
	
	void sumofdigitsnum(String str)
	{
		int n=0;
		int sum=0;
		int num=Integer.parseInt(str);
		while(num>=1)
		{
				n=num%10;
				sum=sum+n;
				num=num/10;
		}
		System.out.println("Sum of number is "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		String strip=sc.next();
		sc.close();
		StringArrayProblem4 arrpro5=new StringArrayProblem4();
		arrpro5.sumofdigitsnum(strip);
		
	}
}
