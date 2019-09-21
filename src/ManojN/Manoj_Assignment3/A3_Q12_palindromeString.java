package ManojN.Manoj_Assignment3;
import java.util.Scanner;
public class A3_Q12_palindromeString {
	static String acceptInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter # to check palindrome");
		int num = sc.nextInt();
		sc.close();
		String Str = String.valueOf(num);
		return Str;
	}
	static void checkPalindrome(String numStr ){
		String newStr="";
		char ch='x';
		int x =numStr.length();
		while (x>0){
			ch = numStr.charAt(x-1);
			newStr = newStr + String.valueOf(ch);
			x--;
		}
		int count=0;
		for (int i=0; i<newStr.length(); i++){
			char ch1 = numStr.charAt(i);
			char ch2 = newStr.charAt(i);
			if (ch1 == ch2)
				count =1;
			else count=0;
		}
		if (count==1)
		System.out.println(newStr + " is palindrome");
		else
		System.out.println(numStr + " is not palindrome");
	}
	
	public static void main(String[] args) {
		checkPalindrome(acceptInput());
		}
}
/*
Q12)	WAP to find word is palindrome or not ?
a.	String name = “naman”
i.	Naman is palindrome
b.	String name = “harsh”
i.	Harsh is not palindrome
*/