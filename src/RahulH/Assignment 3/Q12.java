package assignment_4;

import java.util.Scanner;

public class Q12 {
	//static String str = "Rahul";
	String reverse = "";

	void palindrome(String str) 
	{
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			reverse = reverse + str.charAt(i);	
		}
		// System.out.println(reverse);
		 
		if (reverse.equals(str)) 
		{
			System.out.println(str + " is palinderome");
		}
		else 
		{
			System.out.println(str + " not palinderome");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String s = sc.next();
		System.out.println("The entered name is: " +s);

		new Q12().palindrome(s);
		sc.close();
	}

}
