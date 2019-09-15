package ManojN.Manoj_Assignment4;

public class A4_Q3_Fibonacci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+" , "+num2);
		for (int i=1; i<=5; i++){
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" , "+num3);
			
		}
	}
}
/*
Q3) WAP to print Fibonacci series up to user required.
Example:-
Hint :-
1) Int num1 = 0, int num2 = 1
input :- 7
output: - 0 1 1 2 3 5 8
*/