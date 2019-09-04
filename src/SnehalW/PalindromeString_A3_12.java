package SnehalW;
import java.util.Scanner;
/*12)	WAP to find word is palindrome or not ?
a.	String name = “naman”
i.	Naman is palindrome
b.	String name = “harsh”
i.	Harsh is not palindrome*/

public class PalindromeString_A3_12 {
  
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
