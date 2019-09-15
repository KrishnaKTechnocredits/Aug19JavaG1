package RahulH.Assignmnt_4_String;

import java.util.Scanner;

public class Q10 {

	int cnt = 0;
	
	void occurance(String str, char ch)
	{
		for (int i = 0; i<str.length(); i++)
		{
			if (str.charAt(i) == ch)
			{
				cnt++;
			}
		}
		System.out.println("Char is " +ch +" and number occurrence " + cnt);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();
		System.out.println("The entered string is: " +str);
		
		System.err.println("Please enter the chacter");
		char ch = sc.next().charAt(0);
		System.out.println("The chacter is: " +ch);
		
		new Q10().occurance(str, ch);
		sc.close();
		
	}

}
