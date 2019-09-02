package ShreyaD;

import java.util.Scanner;

public class AssignQ6_sc {
	void Equality(int a[],int b[])
	  {
		  int cnt=0;
		  if(a.length==b.length)
		  {
		  for(int i=0;i<a.length;i++)
		  {
				  if(a[i]==b[i])
					  cnt++;
			  }
				  if(cnt==a.length)
					  System.out.println("array are equal");
				  else
					  System.out.println("array are not equal");
		  }
		          else 
		        	  System.out.println("array are not eqaul");
			  }
	       public static void main(String []args)
	       {
	    	   AssignQ6_sc Q6 = new AssignQ6_sc();
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
		       Q6.Equality(num,num1);
		       sc.close();
	} 

}
