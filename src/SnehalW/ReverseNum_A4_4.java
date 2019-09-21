package SnehalW;

/*WAP to revers number (Consider Input as Integer not as String).
Example:-
input:- 12345
output:- 54321*/
public class ReverseNum_A4_4 {
	static int reverse=0,num=0;
	public static void main(String[] args) {
		int num = 12345;
		System.out.println("The number  is "+ num);
		
		while(num != 0)
	      {
	          reverse = reverse * 10;
	          reverse = reverse + num%10;
	          num = num/10;
	      }
		System.out.println("The reverse is " +reverse);
	}

}
