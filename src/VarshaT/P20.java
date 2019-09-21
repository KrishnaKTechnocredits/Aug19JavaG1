/*
Print below pattern

   * 
  * * 
 *   * 
*     *
 *   * 
  * * 
   * 

 */
package VarshaT;

import java.util.Scanner;

public class P20 {
		void pattern(int n)
		{
			for(int i=1;i<=2*n-1;i++)
			{
				if(i<=n){
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					if(k==1 || k==i)
						System.out.print("* ");
					else
						System.out.print("  ");	
				}
				}
				else
				{
					for(int j=1;j<=i-n;j++)
					{
						System.out.print(" ");
					}
					for(int k=2*n-1;k>=i;k--)
					{
						if(k==2*n-1|| k==i)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
					
				}
				
				System.out.println();
			}
		}

		public static void main(String[] args) {
			P20 p3 = new P20();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the no of rows");
			int n = sc.nextInt();
			p3.pattern(n);
			sc.close();

		}

}
