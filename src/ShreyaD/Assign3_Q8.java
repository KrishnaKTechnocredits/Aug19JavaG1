package ShreyaD;

import java.util.Scanner;

public class Assign3_Q8 {
	void vowel(String str)
	{
		char  c[]=str.toLowerCase().toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count++;
			}
		}
		System.out.println("count ="+count);	
	}
     public static void main(String[] args) {
		Assign3_Q8 Q8 = new Assign3_Q8();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		Q8.vowel(str);
		sc.close();
	}
}
