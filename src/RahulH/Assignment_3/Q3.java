package RahulH.Assignment_3;

import java.util.Scanner;

public class Q3 {
	
	String input = "i";
	void frequency(String str)
	{
		String msg[] = str.split(input);
		if (str.indexOf(input) == str.length()-1)
		{
			System.out.println(input + " frequency is " + msg.length);
		}
		else
		{
			System.out.println("count of " + input + " " + ((msg.length)-1));
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String str = sc.nextLine();
		System.out.println("The entered character is: " +str);
		
		//String str = "electrical engineering";
		new Q3().frequency(str);
		sc.close();
	}

}
