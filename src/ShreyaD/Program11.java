package ShreyaD;
import java.util.Scanner;

public class Program11 {
	

		void palindrome(String s)
		{
			char a[]= s.toCharArray();
			String s1= "";
			for(int i=a.length-1;i>=0;i--)
			{
				s1=s1+String.valueOf(a[i]);
			}
			System.out.println(s1);
			if(s.equals(s1))
			{
				System.out.println("String is palindrome");
			}
			else
			{
				System.out.println("String is not a palindome");
			}
		}

		public static void main(String[] args) {
		   Program11 Program11 = new Program11();
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the string:");
			String s=sc.nextLine();
			Program11.palindrome(s);
			sc.close();

		}

}
