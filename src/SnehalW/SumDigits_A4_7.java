package SnehalW;

import java.util.Scanner;

/*WAP to print sum of digit(Consider Input as Integer not as String)
Example:-
input:- 12345
output:- 15
*/
public class SumDigits_A4_7 {

	public static void main(String[] args) {
		int rem=0,sum=0;	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		while(num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("The sum of number is :"+ sum);
	}
}