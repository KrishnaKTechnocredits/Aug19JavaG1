package ShreyaD;
import java.util.Scanner;
public class program4 {

	    public static void main(String[] args) {

	    	int num1, num2;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number");
	        num1 = scanner.nextInt();
	        System.out.print("Enter second number");
	        num2 = scanner.nextInt();

	        System.out.print("Enter an operator (+, -, *, /)");
	        char operator = scanner.next().charAt(0);

	        scanner.close();
	        int output;

	        switch(operator)
	        {
	            case '+':
	            	output = num1 + num2;
	                break;

	            case '-':
	            	output = num1 - num2;
	                break;

	            case '*':
	            	output = num1 * num2;
	                break;

	            case '/':
	            	output = num1 / num2;
	                break;

	            
	            default:
	                System.out.printf("Entered wrong operator");
	                return;
	        }

	        System.out.println(num1+" "+operator+" "+num2+": "+output);
	    }
	}
