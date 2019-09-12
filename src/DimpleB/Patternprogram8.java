/*Please enter number of rows needed for pattern:
4

    * 
   * * 
  * * * 
 * * * * 
  * * * 
   * * 
    *
 */
package patternassignmentprograms;
import java.util.Scanner;

public class Patternprogram8 
{
	private void printpattern(int rows) 
	{
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		System.out.println();
		for(i=0;i<rows;i++)
		{
			for(j=0;j<rows-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}	
		for(i=rows-1;i>=0;i--)
		{
			for(j=rows-i;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(k=i-1;k>=0;k--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of rows needed for pattern:");
		int num=sc.nextInt();
		Patternprogram8 pp1 = new Patternprogram8();
		pp1.printpattern(num);
		sc.close();
	}
}
