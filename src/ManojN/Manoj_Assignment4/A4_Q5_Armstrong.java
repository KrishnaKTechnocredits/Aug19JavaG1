package ManojN.Manoj_Assignment4;
import java.util.Scanner;
public class A4_Q5_Armstrong {
	static int inputNum(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter # to check Armstrong");
		int num1 = sc.nextInt();
		sc.close();
		return num1;
	}
	static String checkArmstrong(int num1){
		int num =num1;
		int n1=0;
		int n2=0;
		int n3=0;
		while (num>0){
			n1 = num%10;
			num = num/10;
			n2= num%10;
			num = num/10;
			n3= num%10;
			num = num/10;
		}
		String result="";
		if( num1 == ((n1*n1*n1)+ (n2*n2*n2)+ (n3*n3*n3)))
			result = num1 + " is Armstrong";
		else 
			result = num1 + " is not Armstrong";
		return result;
	}
	public static void main(String[] args) {
		System.out.println(checkArmstrong (inputNum()));
		
	}	
}
