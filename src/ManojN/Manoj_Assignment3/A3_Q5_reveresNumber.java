package ManojN.Manoj_Assignment3;
import java.util.Scanner;
public class A3_Q5_reveresNumber {
	static int n,m=0;
	static String n1="";
	static String reveresNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to reveres : ");
		n = sc.nextInt();
		sc.close();
		while (n>0){
			m=n%10;
			n=n/10;
			n1=n1+m+"";
		}
		return n1;
	}
	public static void main(String[] args) {
		System.out.println("Reversed number : " +reveresNum());
	}
}
/*
Q5)	WAP to reveres user given number
a.	Input number:- 456789
b.	Output number :- 987654
*/