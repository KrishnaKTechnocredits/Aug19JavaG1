package VishakhaP;

import java.util.Scanner;

public class Calculator1 {
	public static void main(String args[]){
		double num1 ,num2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no: ");
	     num1 = sc.nextDouble();
		System.out.println("Enter second no :");
		 num2 = sc.nextDouble();
		System.out.println("Enter an operator (+,*,/,-) :");
		char operator =sc.next().charAt(0);
		sc.close();
		double output;
		
		switch (operator)
		{
		case  '+':
		output= num1 + num2;
		break;
		
		case '-' :
		output= num1-num2;
		break;
		
		case '/' :
		output= num1/num2;
		break;
		  
		case '*' :
		output= num1*num2;
		break;
		
		default:
			System.out.println("You have enter wromg operator");
			return;
		
		}
		System.out.println(num1+" "+operator+" "+num2+": "+output);
	}
}

		
		
	





