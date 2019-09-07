
/* 7)	WAP to find Fibonacci series for user defined number
a.	Input number :- 5
b.	Output :- 120
*/

package DimpleB;
import java.util.Scanner;

public class StringArrayProblem7 {

	void fibonaccinum(String str)
	{
		int fib = 1;
		int num=Integer.parseInt(str);
		while(num>=1)
		{
			fib=fib*num;
			num--;
		}
		System.out.println("Fibonacci of number is "+fib);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		String strip=sc.next();
		sc.close();
		StringArrayProblem7 arrpro7=new StringArrayProblem7();
		arrpro7.fibonaccinum(strip);

	}
}


