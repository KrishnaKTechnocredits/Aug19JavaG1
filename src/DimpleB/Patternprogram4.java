/*WAP to print as below:
 Please enter number of rows needed for pattern:
5

****** 
*****  
****   
***    
**     
*
 */
package DimpleB;
import java.util.Scanner;

public class Patternprogram4 {
	private void printpattern(int rows) 
	{
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		System.out.println();
		for(i=rows;i>=0;i--)
		{
			for(k=i;k>=0;k--)
			{
				System.out.print("*");
			}
			for(j=rows-i;j>=0;j--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of rows needed for pattern:");
		int num=sc.nextInt();
		Patternprogram4 pp4 = new Patternprogram4();
		pp4.printpattern(num);
		sc.close();
	}
}
