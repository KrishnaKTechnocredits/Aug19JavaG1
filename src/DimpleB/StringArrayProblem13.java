/* 13)	WAP to find number is Armstrong or not.
a.	Int number = 153
i.	Number is Armstrong
b.	Int number = 234
i.	Number is not Armstrong 
Note :- Armstrong number means sum of each number cubes to number it self.
*/
package DimpleB;
import java.util.Scanner;

public class StringArrayProblem13 {
	void checkarmstrongnumber(String str)
	{
		int n=0;
		int cubesum=0;
		int num=Integer.parseInt(str);
		int num1=num;
		while(num1>=1)
		{
				n=num1%10;
				cubesum=cubesum+(n*n*n);
				num1=num1/10;
		}
		if(cubesum==num)
			System.out.println("User defined number "+num+" is an armstrong number");
		else
			System.out.println("User defined number "+num+" is not an armstrong number");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be checked for armstrong number:");
		String strip=sc.next();
		sc.close();
		StringArrayProblem13 arrpro13=new StringArrayProblem13();
		arrpro13.checkarmstrongnumber(strip);
	}

}
