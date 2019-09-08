package SnehalW;

import java.util.Scanner;
/*
5)	WAP to reveres user given number
a.	Input number:- 456789
b.	Output number :- 987654
*/
public class ReverseNumber_A3_5 {
int reverse=0; 
	void reverse()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
	
		while(num != 0)
	      {
	          reverse = reverse * 10;
	          reverse = reverse + num%10;
	          num = num/10;
	      }
		
		System.out.println("The reverse number is :"+ reverse);
	}
	public static void main(String[] args) {
		ReverseNumber_A3_5 reversenumber = new ReverseNumber_A3_5();
		reversenumber.reverse();
	}
}
