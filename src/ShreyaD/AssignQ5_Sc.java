package ShreyaD;

import java.util.Scanner;

public class AssignQ5_Sc {

	void Max(int a[])
	{
		int max1,max2=0;
		max1=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max1>a[i]){
				if(max2<a[i])
					max2=a[i];
			}
			else{
				max2=max1;
				max1=a[i];
			}
		}
		System.out.println("second max number is"+max2);
	}

	
	public static void main(String []args){
		
	
	 
	 AssignQ5_Sc Q5 = new AssignQ5_Sc();
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the no");
	int size = sc.nextInt();
	int num[] = new int[size];
	for (int i = 0; i < num.length; i++) {
		System.out.println("enter the number of array:");
		num[i] = sc.nextInt();
	}
	Q5.Max(num);
	sc.close();
}
}
