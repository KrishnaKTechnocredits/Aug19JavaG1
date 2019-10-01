package ShreyaD;
import java.util.Scanner;

public class Program8 {

	void seperate_str(String str) {
		char c[] = str.toCharArray();
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
		Program8 Program8 = new Program8();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		Program8.seperate_str(str);
		sc.close();

	}

}
