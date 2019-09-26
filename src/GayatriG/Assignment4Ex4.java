//WAP to revers number (Consider Input as Integer not as String). 
// input:- 12345  output:- 54321   
package assignment4;

public class Assignment4Ex4 {
	static void reverseNumber(int num){
		while(num>0){
			int mod=num%10;
			System.out.print(mod+" ");
			int div = num/10;;
			num=div;
		}
	}
	public static void main(String[] args) {
		int input=12345;
		reverseNumber(input);
	}
}
