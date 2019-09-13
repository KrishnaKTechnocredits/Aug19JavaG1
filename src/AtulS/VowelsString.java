//WAP to find vowels in given string 
package AtulS;

import java.util.Scanner;

public class VowelsString {

	int vowelcount(String str) {
		int cnt = 0;
		char[] ch = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < ch.length; j++) {
				if (str.charAt(i) == ch[j]) {
					cnt++;
				}
			}

		}
		return cnt;
	}

	public static void main(String[] args) {
		String str;
		VowelsString vs = new VowelsString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		str = sc.nextLine();
		System.out.println("No of vowels in given string is:" + vs.vowelcount(str));

	}

}
