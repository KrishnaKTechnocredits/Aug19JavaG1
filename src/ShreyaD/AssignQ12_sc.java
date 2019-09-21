package ShreyaD;

import java.util.Scanner;

public class AssignQ12_sc {

	void Common(int a1[],int a2[])
	{
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
					System.out.println(a1[i]);
					
			}
		}
	}
public static void main(String []args)
{
	AssignQ12_sc Q12 = new AssignQ12_sc();
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the no");
	int size = sc.nextInt();
	int size1 = sc.nextInt();
	int num[] = new int[size];
	int num1[] = new int[size1];
	for (int i = 0; i < num.length; i++) {
		System.out.println("enter the number of 1st array:");
		num[i] = sc.nextInt();
	}
	for (int i = 0; i < num1.length; i++) {
		System.out.println("enter the number of 2nd array:");
		num1[i] = sc.nextInt();
	}
	sc.close();
	Q12.Common(num,num1);
}
}