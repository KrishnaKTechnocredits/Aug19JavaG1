package RahulH.Assignmnt_4_String;

import java.util.Scanner;

public class Q2 {
	
	void fullStringReverse(String str)
	{
		for (int i=str.length()-4; i>=0; i--)
		{
			System.out.print(str.replaceAll(" ", "").charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String str = sc.nextLine();
		System.out.println("The entered string is: " + str);
		
		new Q2().fullStringReverse(str);
		sc.close();
	}

}
