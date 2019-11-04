//WAP to print sum of digit(Consider Input as Integer not as String) 

package GayatriG;

public class Assignment4Ex7 {
	static void sunOfDigit(int input){
		int sum=0;
		while(input>0){
			int mod=input%10;
			sum=sum+mod;
			input=input/10;
		}
		System.out.println("Sum of digits in the given no is "+sum);
	}
	public static void main(String[] args) {
		int num=12345;
		sunOfDigit(num);
	}
}
