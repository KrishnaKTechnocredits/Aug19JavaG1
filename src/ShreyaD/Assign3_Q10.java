package ShreyaD;

import java.util.Scanner;

public class Assign3_Q10 {
 
	void sum(int num[],int num1[])
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
			
		}
		for(int i=0;i<num1.length;i++)
		{
			sum=sum+num1[i];
		}
		System.out.println("sum is:"+sum);
		
	}
 public static void main(String[] args){

	Assign3_Q10 Q10 = new Assign3_Q10();
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter the no");
    int size = sc.nextInt();
    int size1 = sc.nextInt();
    int num[] = new int[size];
    int num1[] = new int[size1];
      for (int i = 0; i < num.length; i++)
      {
	       System.out.println("enter the number of 1st array:");
	       num[i] = sc.nextInt();
      }
      for (int i = 0; i < num1.length; i++) 
      {
	       System.out.println("enter the number of 2nd array:");
	       num1[i] = sc.nextInt();
      }
         sc.close();
        Q10.sum(num,num1);
}
}
