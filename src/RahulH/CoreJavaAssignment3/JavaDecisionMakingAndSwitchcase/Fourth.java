package coreJavaAssignment3;

import java.util.Scanner;

public class Fourth {

	int a=5;
	int b=10;
	int ans;
	
	void Calculator(String symbol)
	{
		switch (symbol){
		case "+":
			ans = a+b;
			System.out.println(ans);
			break;
			
		case "-": 
			ans=a-b;
			System.out.println(ans);
			break;
			
		case "/":
			ans=a/b;
			System.out.println(ans);
			break;
			
		case "*":
			ans=a*b;
			System.out.println(ans);
			break;
			
		default:
			System.out.println("We are working on it");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the symbol");
		String str = sc.next();
		System.out.println("The symbol entered is: "+str);
		
		Fourth c = new Fourth();
		c.Calculator(str);
		sc.close();
		
	}
}
