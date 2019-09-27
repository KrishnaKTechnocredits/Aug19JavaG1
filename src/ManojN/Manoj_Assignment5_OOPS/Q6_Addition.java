package ManojN.Manoj_Assignment5_OOPS;

import java.util.Scanner;

public class Q6_Addition {
	
	static void add(int x, int y){
		System.out.println("addition of integers = "+ (x+y));
	}
	static void add(float x, float y){
		System.out.println("addition of decimals = "+ (x+y));
	}
	static void add(String x, String y){
		System.out.println("addition of Strings = "+ (x+y));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 2 integers to add");
		add(sc.nextInt(), sc.nextInt());
		System.out.println("Enter 2 decimals to add");
		add(sc.nextFloat(), sc.nextFloat());
		System.out.println("Enter 2 Strings to add");
		add(sc.next(), sc.next());
		sc.close();
	}
}
