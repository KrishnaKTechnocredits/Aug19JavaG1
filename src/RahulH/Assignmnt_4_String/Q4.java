package RahulH.Assignmnt_4_String;

import java.util.Scanner;

public class Q4 {
	
	void reverse(int num)
	{
		int temp = num;
		int r=0;
		int s=0;
		
		while (temp > 0)
		{
			r = temp%10;
			temp = temp/10;
			s = s*10 + r;
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		System.out.println("The entered number is: " +num);
		
		new Q4().reverse(num);
		sc.close();
		
	}

}
