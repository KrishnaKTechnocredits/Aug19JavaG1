package ShreyaD;

import java.util.Scanner;

public class Assign3_Q15 {
	void length(String num[])
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i].length()>7)
			{
				System.out.println("name length more then 7 character is:"+num[i]);
			}
		}
	}

	public static void main(String[] args) {
		
	Assign3_Q15 Q15= new  Assign3_Q15();
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the no");
	int size = sc.nextInt();
	sc.nextLine();
	String num[]=new String[size];
	for (int i = 0; i < size; i++) {
		System.out.println("enter the string");
		num[i] = sc.nextLine();
	}
	Q15.length(num);
	sc.close();
}
}

