package SnehalW;

//PalindromeString is or not

import java.util.Scanner;

public class PalindromeString_A4_11 {

	public static void main(String[] args) {
		 int length=0;
		 String reverse="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word :");
		String str = sc.next();
		String temp =str;
		
		for(int i = str.length()-1;  i>=0; i--)
		{
			reverse= reverse+str.charAt(i);			
		}
		if(str.equals(reverse))
		{
			System.out.println("The word is palindrom");
		}
		else
		{
			System.out.println("The word is not palindrom");
		}

	}

}
