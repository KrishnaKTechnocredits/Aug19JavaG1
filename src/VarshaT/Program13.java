/*
 *13)	WAP to find number is Armstrong or not.
a.	Int number = 153
i.	Number is Armstrong
b.	Int number = 234
i.	Number is not Armstrong 
Note :- Armstrong number means sum of each number cubes to number it self.

 */


package VarshaT;
import java.util.Scanner;
public class Program13 {

	void arm_no(int num)
	{
		int sum=0,x=0,num1=0;
		num1=num;
		while(num>0)
		{
			x=num%10;
			num/=10;
			sum+=x*x*x;
		}
		if(num1==sum)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
			
	}
	public static void main(String[] args) {
		Program13 program13= new Program13();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		program13.arm_no(num);
		sc.close();

	}

}
