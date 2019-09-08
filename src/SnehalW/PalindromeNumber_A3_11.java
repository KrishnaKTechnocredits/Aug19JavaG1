package SnehalW;
import java.util.Scanner;

/*11)	WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and backward
i.e. actual number :- 12321
reverse  of actual number :- 12321
*/
public class PalindromeNumber_A3_11 {
	
	public static void main(String args[])
	{
		int sum=0,rem=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int temp= num;
		
		while(num>0)
		{
			rem = num % 10;
			sum = (sum*10)+rem;
			num = num / 10;
		}
		if(temp==sum)
		{
			System.out.println("The number is palindrom");
		}
		else
		{
			System.out.println("The number is not palindrom");
		}
		
	}
}
