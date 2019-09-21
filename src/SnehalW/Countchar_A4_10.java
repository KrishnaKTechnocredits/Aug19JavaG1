package SnehalW;

import java.util.Scanner;

public class Countchar_A4_10 {
/*Input:hello how are you harsh?
 * input:h
 * output: h occurs 4 time*/
	public static void main(String[] args) {
		String str = "hello how are you harsh ?";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character :");
		String s = sc.next();
		char ch= s.charAt(0);
		int count=0;
	
		for(int i=0; i<=str.length()-1; i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("Character "+ch+" occurs " + count+" times ");		
	}
}
