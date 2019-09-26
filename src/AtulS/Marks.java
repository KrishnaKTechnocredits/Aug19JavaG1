//WAP to input student marks by condition
package AtulS;

import java.util.Scanner;

public class Marks {

	public void display() {
		System.out.println(calculateMarks());
	}

	private String calculateMarks() {
		int num = inputmarks();
		if (num > 0 && num <= 50)
			return "Failed";
		else if (num > 50 && num < 75)
			return "1st class";
		else if (num > 75 && num < 100)
			return "Distinction";
		else
			return "Invalid input";

	}

	private int inputmarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		return num;

	}

	public static void main(String[] args) {
		Marks m = new Marks();
		m.display();
	}

}
