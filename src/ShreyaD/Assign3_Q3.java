package ShreyaD;

import java.util.Scanner;

public class Assign3_Q3 {

	void frequency(String str,char c)
	{
		String s[]=str.split("e");
		if(str.charAt(str.length()-1)=='e')
		{
			System.out.println("char value"+c);
			System.out.println("char count:"+s.length);
		}
		else{
			System.out.println("char value:"+c);
		    System.out.println("char count:"+(s.length-1));
	        }
	}

	public static void main(String[] args) {
		Assign3_Q3 Q3 = new Assign3_Q3();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		System.out.println("enter the character");
		char c= sc.next().charAt(0);
		Q3.frequency(str,c);
		sc.close();
		
		
	}
}
