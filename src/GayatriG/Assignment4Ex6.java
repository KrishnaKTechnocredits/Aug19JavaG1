//WAP to print factorial number 

package assignment4;

public class Assignment4Ex6 {
	static int factorial(int num){
		int fact=1;
		for(int i=num;i>0;i--){
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int num=5;
		int fact=factorial(num);
		System.out.println("Factorial of given no is "+fact);
	}
}
