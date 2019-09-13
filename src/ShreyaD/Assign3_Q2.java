package ShreyaD;

import java.util.Scanner;

public class Assign3_Q2 {
	void Maxlength(String num[]){
		String str = null;
		int cnt = 0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i].length()>cnt)
			{
				cnt=num[i].length();
				str=num[i];
			}
		}
		System.out.println("Max length of string"+str);
	}

	public static void main(String[] args) {
		Assign3_Q2 Q2= new  Assign3_Q2();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no");
		int size = sc.nextInt();
		sc.nextLine();
		String num[]=new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the string");
			num[i] = sc.nextLine();
		}
		Q2.Maxlength(num);
		sc.close();
	}
	}

