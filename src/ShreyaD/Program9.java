package ShreyaD;
import java.util.Scanner;
public class Program9 {
	
		void reverse(String str)
		{
			String s1[]=str.split(" ");
			String s2="";
			for(int i=0;i<s1.length;i++)
			{
				for(int j=s1[i].length()-1;j>=0;j--)
				{
					s2+=String.valueOf(s1[i].charAt(j));
				}
			}
			System.out.println("reverse String:"+s2);
		}

		public static void main(String[] args) {
		Program9 Program9 = new Program9();
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the string:");
			String s=sc.nextLine();
			Program9.reverse(s);
			sc.close();


		}

}
