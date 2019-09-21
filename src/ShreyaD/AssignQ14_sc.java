package ShreyaD;

import java.util.Scanner;

public class AssignQ14_sc {

	void Even(int a[]){
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println("even no is :"+a[i]+" ");
		}		
	}
	
public static void main(String []args)
{
	AssignQ14_sc Q14 = new AssignQ14_sc();
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the no");
	int size = sc.nextInt();
	int num[] = new int[size];
	for (int i = 0; i < num.length; i++) {
		System.out.println("enter the number of 1st array:");
		num[i] = sc.nextInt();
	}
	Q14.Even(num);
	sc.close();
}
}
