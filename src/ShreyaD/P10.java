package ShreyaD;

import java.util.Scanner;
public class P10 {

	
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
				P10 p10 = new P10();
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the no of rows");
				int n = sc.nextInt();
				p10.pattern(n);
				sc.close();

			}

}
