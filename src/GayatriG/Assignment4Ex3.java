/*WAP to print Fibonacci series up to user required.
Example:- 
Hint :-  1) Int num1 = 0, int num2 = 1  input :- 7  output: - 0 1 1 2 3 5 8  
*/
package GayatriG;

public class Assignment4Ex3 {
	static void fibonacciSeries(int x ){
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		for(int i=2;i<x;i++){
			
			int num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			}
		
		
	}
	public static void main(String[] args) {
		int input=7;
		fibonacciSeries(input);
	}
}
