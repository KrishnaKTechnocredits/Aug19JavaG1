//WAP to find string which has length more than 7 character
package AtulS;

import java.util.Scanner;

public class MaxString7Character {

	static void maxlength(String[] str) { // get string more than 7 character
		String tempstr = "";
		String[] strarr;
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > 7) {
				tempstr = ";" + str[i] + "," + tempstr;
				tempstr = tempstr.replaceFirst(";", "");
			}
		}
		strarr = tempstr.split(",");
		display(strarr);
	}

	static void display(String[] str) {	//display all the string having character count more than 7
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	void input() { // take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of words you want to enter");
		int wordscnt = sc.nextInt();
		String str[] = new String[wordscnt];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter " + (i + 1) + " word");
			str[i] = sc.next();
		}
		sc.close();
		maxlength(str);
	}

	public static void main(String[] args) {
		MaxString7Character obj = new MaxString7Character();
		obj.input();

	}

}
