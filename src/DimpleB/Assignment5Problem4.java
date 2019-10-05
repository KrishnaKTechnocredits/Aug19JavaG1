/*
 Write a Java Program and create Calculator using switch statement
 */
package DimpleB;
import java.util.Scanner;

public class Assignment5Problem4 {
	
	void calculator()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int number1=sc.nextInt();
		System.out.println("Enter number :");
		int number2=sc.nextInt();
		System.out.println("Enter operation :");
		String op=sc.next();
		sc.close();
		switch(op)
		{
				case "+" :
							System.out.println(number1+" "+op+" "+number2+" = "+(number1+number2));
							break;
				case "-":
							System.out.println(number1+" "+op+" "+number2+" = "+(number1-number2));
							break;
				case "*":
						System.out.println(number1+" "+op+" "+number2+" = "+(number1*number2));
							break;
				case "/":
						System.out.println(number1+" "+op+" "+number2+" = "+(number1/number2));
							break;
				default:
							System.out.println("Please enter valid operation!");
							break;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment5Problem4 assignment5problem4=new Assignment5Problem4();
		assignment5problem4.calculator();
		
	}
}
