package SnehalW;
import java.util.Scanner;

/*13)	WAP to find number is Armstrong or not.
a.	Int number = 153
i.	Number is Armstrong
b.	Int number = 234
i.	Number is not Armstrong 
*/
public class Armstrong_A3_13 {

	public static void main(String[] args) {
		int sum=0,rem=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int temp = num;
		
		while(num>0)
		{
			rem = rem % 10;
			sum = sum +(rem*rem*rem);
			num = num/10; 
		}
		if(temp==sum)
		{
			System.out.println("The number is Armstrong");
		}
		else
		{
			System.out.println("The number is not Armstrong");
		}
		
	}

}
