package ShreyaD;
import java.util.Scanner;

public class Program10 {
	
		void char_count(String s,char c)
		{
			int initial=s.length();
			int finl=s.replaceAll(String.valueOf(c), "").length();
			System.out.println("count of "+c+" in "+s+" is="+(initial-finl));
			
		}
		public static void main(String[] args) {
			Program10 Program10 = new Program10();
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the string:");
			String s=sc.nextLine();
			System.out.println("enter the character:");
			char c= sc.next().charAt(0);
			Program10.char_count(s,c);
			sc.close();


		}

	}


