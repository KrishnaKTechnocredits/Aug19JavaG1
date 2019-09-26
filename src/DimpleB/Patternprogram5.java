/*WAP to print as below:
 Please enter number of rows needed for pattern:
5

  * * * * * *
   * * * * *
    * * * *
     * * *
      * *
       * 
 */
package DimpleB;
import java.util.Scanner;

public class Patternprogram5 
{
	private void printpattern(int rows) 
	{
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		System.out.println();
		for(i=rows;i>=0;i--)
		{
			for(j=rows-i;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(k=i;k>=0;k--)
			{
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of rows needed for pattern:");
		int num=sc.nextInt();
		Patternprogram5 pp5 = new Patternprogram5();
		pp5.printpattern(num);
		sc.close();
	}
}
