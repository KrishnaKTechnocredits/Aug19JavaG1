//WAP to reverse the word
package AtulS;

import java.util.Scanner;

public class ReverseSentence {

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
		String newStr = "";
		for (int i = 0; i < newStrArr.length; i++) {
			newStr = reverse(newStrArr[i]);
			display(newStr);
		}
	}

	void display(String str) // display reverse string
	{
		System.out.print(str);
	}

	void input() { // Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		sc.close();
		getword(str);

	}

	public static void main(String[] args) {
		ReverseSentence revstr = new ReverseSentence();
		revstr.input();

	}

}
