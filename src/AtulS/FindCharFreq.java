//WAP to find frequency of user defined character in user defined String
package AtulS;

import java.util.*;

public class FindCharFreq {

	int findchar(String str, char ch) { // Query in this function:not working
										// for string elee
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				cnt = cnt + 1;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		char ch;
		String str;
		FindCharFreq fc = new FindCharFreq();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		str = sc.nextLine();
		System.out.println("Enter char which you want to find:");
		ch = sc.next().charAt(0);
		sc.close();
		System.out.println(fc.findchar(str, ch));
	}

}
