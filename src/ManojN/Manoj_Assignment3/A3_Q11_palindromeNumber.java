package ManojN.Manoj_Assignment3;
import java.util.Scanner;
public class A3_Q11_palindromeNumber {
	static String acceptInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check palindrome");
		String Str = sc.next();
		sc.close();
		
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
Q11)	WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from 
forward and backward
i.e. actual number :- 12321
reverse  of actual number :- 12321

*/