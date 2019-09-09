package SnehalW;

import java.util.Scanner;

/*WAP to check if a number is Armstrong or not
Example:-
input:- 153
output:-153
*/
public class Armstrong_A4_5 {
static int rem=0,sum=0;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int temp = num;
		while(num>0)
		{
			rem=num%10;
			sum = sum+(rem*rem*rem);
			num= num/10;
		}
		if(temp==sum)
		{
		System.out.println("The number " +temp+" is Armstrong");
		}
		else
		{
			System.out.println("The number " +temp+" is not Armstrong");
		}
	}
}
