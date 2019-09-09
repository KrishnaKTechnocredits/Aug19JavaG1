package SnehalW;

import java.util.Scanner;

/*separate digits and characters from the user define string.
Hint:- using ASCII and Charater method
input:- a1b22sd5e2fw2sd3e
output:-absdefwsde 122523*/
public class SeparateCharString_A4_8 {

	public static void main(String[] args) {
		String str = "a1b22sd5e2fw2sd3e";
		String number="";
		String letter="";
		
		for (int i=0; i<=str.length()-1;i++)
		{
			char a = str.charAt(i);
			if(Character.isDigit(a))
			{
				number = number + a;
			}
			else
			{
				letter= letter + a;
			}
		}
		System.out.println("Alphabets in string : "+ letter);
		System.out.println("Numbers in string : "+ number);		
	}
}
