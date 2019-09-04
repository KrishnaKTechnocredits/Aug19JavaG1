//8)	WAP to find vowels in given string 

package GayatriG;

import java.util.Scanner;

public class Assignment3Ex8 {
	static void vowelsCount(String str) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int x = 0; x < str.length(); x++) {
			switch (str.charAt(x)) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			}
		}
		System.out.println("Count of a:" + a + "\nCount of e:" + e + "\nCount of i:" + i + "\nCount of o:" + o
				+ "\nCount of u:" + u);
		System.out.println("Total vowel count is" + (a + e + i + o + u));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.nextLine();
		str = str.toLowerCase();
		vowelsCount(str);
	}
}
