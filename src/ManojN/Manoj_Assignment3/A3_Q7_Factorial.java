package ManojN.Manoj_Assignment3;

import java.util.Scanner;

public class A3_Q7_Factorial {
	static int userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number to calculate Factorial : ");
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	static int fact(int num){
		int factorial=1;
		while(num>0){
			int temp =num;
			factorial = factorial * temp;
			num--;
		}
		return factorial;
	}
	public static void main(String[] args) {
		int x = userInput();
		System.out.println("Factorial of " + x+ " is " +fact(x));
	}
}
/*
 * Q7) WAP to find Factorial series for user defined number 
 * a. Input number :- 5
 * b. Output :- 120
 */