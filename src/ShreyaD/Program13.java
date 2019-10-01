package ShreyaD;
import java.util.Scanner;
public class Program13 {
		void reverse(String s)
		{
		String s1[]= s.split(" ");
		String rev="",temp="";
		for(int i=0;i<s1.length;i++)
		{
			temp="";
			if(i%2==0)
			{
				for(int j=s1[i].length()-1;j>=0;j--)
				{
					temp+=String.valueOf(s1[i].charAt(j));
				}
			}
			else
			{
				temp=s1[i];
			}
			rev+=temp+" ";
		}
		System.out.println("reverse string: "+ rev);
		}

		public static void main(String[] args) {

			Program13 Program13= new Program13();
			Scanner sc= new Scanner(System.in);
			System.out.println(" enter the string");
			String s= sc.nextLine();
			Program13.reverse(s);
			sc.close();

		}

	}
