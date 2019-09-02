package ShreyaD;

import java.util.Scanner;

public class AssignQ10_sc {
	void Maxdiffindex(int arr1[],int arr2[])
	{
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i])
				{
					System.out.println("values are not match at index:"+i);
					if(arr1[i]>arr2[i])
					    System.out.println("max value is:"+arr1[i]);
					else
						System.out.println("max value is:"+arr2[i]);
				}
	    }
	}
	else
	    System.out.println("Arrays are not match");
}
     public static void main(String []args)
  { 
    AssignQ10_sc Q10 = new AssignQ10_sc();
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
    Q10.Maxdiffindex(num,num1);
 
}

}
