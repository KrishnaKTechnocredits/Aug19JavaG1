/*WAP to print as below:
 Please enter number of rows needed for pattern:
5

    * 
   * * 
  *   * 
 *     * 
*********
 */

package DimpleB;
import java.util.Scanner;

public class Patternprogram9 
{
	private void printpattern(int rows) 
	{
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		int m=0;
		System.out.println();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows-i;j++)
			{
				System.out.print(" ");
			}
			if(i<rows)
			{
				for(k=1;k<=i;k++)
				{
					if(k==1||k==i)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			else
			{
					for(m=1;m<=(rows*2)-1;m++)
					{
						System.out.print("*");
					}
					
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of rows needed for pattern:");
		int num=sc.nextInt();
		Patternprogram9 pp1 = new Patternprogram9();
		pp1.printpattern(num);
		sc.close();
	}
}
