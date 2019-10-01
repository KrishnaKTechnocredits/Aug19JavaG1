package ShreyaD;
import java.util.Scanner;

public class Program14 {
		void reversestr(String s)
		{
		String s1[]= s.split(" ");
		String rev="",temp="";
		for(int i=s1.length-1;i>=0;i--)
		{
			temp="";
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				temp+=String.valueOf(s1[i].charAt(j));
			}
			if(i%2!=0)
			{
				temp=temp.toUpperCase();
			}
			rev+=temp+" ";
		}
		System.out.println("reverse string: "+ rev);
		}

		public static void main(String[] args) {

			Program14 Program14= new Program14();
			Scanner sc= new Scanner(System.in);
			System.out.println(" enter the string");
			String s= sc.nextLine();
			Program14.reversestr(s);
			sc.close();

		}

		
	}
