package VishakhaP;

public class ArmstrongNumber {
	public static void main(String[] args) {

	        int num = 153; 
	        int number, a, total = 0;

	        number = num;
	        while (number != 0)
	        {
	            a = number % 10;
	            total = total + a*a*a;
	            number /= 10;
	        }

	        if(total == num)
	            System.out.println(" Armstrong number :" +num);
	        else
	            System.out.println("not an Armstrong number :"+num);
	    }
	}