package RahulH;

import java.util.Scanner;

public class Q11 {
	
	int reverse;
	int s = 0;
	
	void palindrome(int num)
	{
		int temp = num;
		
		while (temp > 0)
		{
			reverse = temp%10;
			temp = temp/10;
			s = s*10+reverse;
		}
		if (num == s)
		{
			System.out.println(num + " is Palindrome");
		}else
		{
			System.out.println(num + " Not palindrome");
		}
	}
	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int num = sc.nextInt();
		System.out.println("The entered number is: " +num);
		
		new Q11().palindrome(num);
		sc.close();
	}

}
