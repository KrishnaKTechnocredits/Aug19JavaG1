/*
 4)	WAP to find sum of user given number.
a.	Input:- 159753
b.	Sum of given number:- 30

 */


package VarshaT;
import java.util.Scanner;
public class Program4 {
	void sum(int num)
	{
		int x=0,sum=0;
		while(num>0)
		{
			x=num%10;
			num/=10;
			sum+=x;
			
		}
		System.out.println("sum of given numbers: "+sum);
	}

	public static void main(String[] args) {
		Program4 program4= new Program4();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		program4.sum(num);
		sc.close();

	}

}
