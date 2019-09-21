package ManojN.Manoj_Assignment4;
import java.util.Scanner;
public class A4_Q11_palidromeString {
	static String acceptInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to check palindrome");
		String str = sc.next();
		sc.close();		
		return str;
	}
	static void checkPalindrome(String str1 ){
		String rev="";
		for (int i=str1.length()-1; i>=0;i--){
			rev = rev + str1.charAt(i);
		}		
		if (str1.equalsIgnoreCase(rev)==true)
			System.out.println("String '"+str1+"' is palidrome");
		else
			System.out.println("String '"+str1+"' is not palidrome");
	}
	public static void main(String[] args) {
		checkPalindrome(acceptInput());
	}
}
/*
WAP to find given string is palidrome or not
Example:-
#palidrome defines as The characters read the same backward as forward
1) input :- racecar
output:- racecar
2) input:-nitin
output:-nitin
*/