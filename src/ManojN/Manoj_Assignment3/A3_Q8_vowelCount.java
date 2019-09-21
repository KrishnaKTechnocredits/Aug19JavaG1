package ManojN.Manoj_Assignment3;
import java.util.Scanner;
public class A3_Q8_vowelCount {
	static String userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.nextLine();
		sc.close();
		return str;
	}
	static void vowel(String str1){
		int count =0;
		for (int i=0; i<str1.length(); i++){
			if ((str1.charAt(i) == 'a')
					|(str1.charAt(i) == 'e')
					|(str1.charAt(i) == 'i')
					|(str1.charAt(i) == 'o')
					|(str1.charAt(i) == 'u'))
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		String str1 = userInput();
		vowel(str1);
	}
}
/*
Q8)	WAP to find vowels in given string 
a.	Input :- automation engineering
b.	Count :- 11
*/