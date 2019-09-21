//Reverse string present in even index
package AtulS;

import java.util.Scanner;

public class ReverseStringEvenIndex {

	String reverse(String str) // Reverse string
	{
		String tempStr = "";
		for (int i = 0; i < str.length(); i++) {
			tempStr = str.charAt(i) + tempStr;
		}
		return tempStr;
	}

	void getword(String str) // get word after removing whitespace
	{
		String[] newStrArr = str.split(" ");
		for (int i = 0; i < newStrArr.length; i++) {
			if (i % 2 == 0) {
				newStrArr[i] = reverse(newStrArr[i]);
			}
		}
		display(newStrArr);
	}

	void display(String[] str) // display reverse string
	{
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	void input() { // Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		sc.close();
		getword(str);
	}

	public static void main(String[] args) {
		ReverseStringEvenIndex rev = new ReverseStringEvenIndex();
		rev.input();
	}

}
