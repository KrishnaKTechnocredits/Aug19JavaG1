//WAP to character occurring in user defined String and Character
package AtulS;

import java.util.Scanner;

public class CharacterCount {

	int findcharnew(String name, char ch, int index) {
		if (index >= name.length())
			return 0;
		int count = name.charAt(index) == ch ? 1 : 0;
			return count + findcharnew(name, ch, index + 1);
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		System.out.println("Enter character:");
		Character ch = sc.next().charAt(0);
		System.out.println(findcharnew(str, ch, 0));
		sc.close();
	}

	public static void main(String[] args) {
		CharacterCount ch = new CharacterCount();
		ch.input();

	}

}
