package ManojN.Manoj_Assignment4;
import java.util.Scanner;
public class A4_Q4_reverseIntNumber {
	static String input(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter # to reverse :");
		int x = sc.nextInt();
		sc.close();
		String str = ""+x;
		return str;
	}
	static void reverseString(String x){
		
		String rev="";
		for (int i=x.length()-1; i>=0;i--){
			rev= rev+x.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		reverseString(input());
	}
}
/*
Q4) WAP to revers number (Consider Input as Integer not as String).
Example:-
input:- 12345
output:- 54321
*/