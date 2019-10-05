//4. Write a Java Program and create Calculator using switch statement 
package VarshaT;

import java.util.Scanner;

public class A5_P4 {
	int a,b;
	char c;
	void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 2 no's ");
		a=sc.nextInt();
		b= sc.nextInt();
		System.out.println("enter the operation to be performed:");
		c= sc.next().charAt(0);
		sc.close();
	}
	void calc(int a, int b, char c)
	{
		switch (c)
		{
			case '+':
				System.out.println(a+"+"+b+" = "+(a+b));
				break;
				
			case '-':
				System.out.println(a+"-"+b+" = "+(a-b));
				break;
			
			case '*':
				System.out.println(a+"*"+b+" = "+(a*b));
				break;
				
			case '/':
				System.out.println(a+"/"+b+" = "+(a/b));
				break;
			
			case '%':
				System.out.println(a+"%"+b+" = "+(a%b));
				break;
				
			default:
				System.out.println("oops!! wrong input");
		}	
	}

	public static void main(String[] args) {
		A5_P4 a5_P4= new A5_P4();
		a5_P4.input();
		a5_P4.calc(a5_P4.a,a5_P4.b,a5_P4.c);
		
	}
}
