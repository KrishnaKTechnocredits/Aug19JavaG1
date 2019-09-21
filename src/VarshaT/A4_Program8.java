/*
 *  separate digits and characters from the user define string. Example:- 
 *  Hint:- using ASCII and Charater method 
 *   input:- a1b22sd5e2fw2sd3e  output:-absdefwsde 122523 
 */

package VarshaT;

import java.util.Scanner;

public class A4_Program8 {

	void seperate(String s) {
		char c[] = s.toCharArray();
		String num_str = "";
		String char_str = "";
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			for (int j = 0; j <=9; j++) {
				if (String.valueOf(c[i]).contains("" + j)) {
					count = 1;
					num_str += String.valueOf(c[i]);
					break;

				}
			}
			if (count == 0) {
				char_str += String.valueOf(c[i]);

			}

		}
		System.out.println(char_str + "  " + num_str);
	}

	public static void main(String[] args) {
		A4_Program8 a4_Program8 = new A4_Program8();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		a4_Program8.seperate(s);
		sc.close();

	}

}
