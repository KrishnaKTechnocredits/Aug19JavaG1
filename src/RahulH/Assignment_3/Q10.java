
/*
 * Hello reviewer
 * I am unable to send parameterized array. But I was successful to create two arrays using Scanner class.  
 */


package RahulH.Assignment_3;

import java.util.Scanner;

public class Q10 {
	
	int sumA =0;
	int sumB =0;
	int total;
	
	void addTwoArray(int[] a, int[] b)
	
	{
		for (int i=0; i<a.length; i++)
		{
			sumA = sumA + a[i];
		}
		System.out.println("Array A sum: " +sumA);
		
		for (int i=0; i<b.length; i++)
		{
			sumB = sumB + b[i];
		}
		System.out.println("Array B sum: " +sumB);
		System.out.println("Addition on Array A and B is " + (sumA+sumB));
	}
	
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<2; i++)
		{
			System.out.println("Please enter the array size for array" + (i+1) + ":");
			int size = sc.nextInt();
			System.out.println("size entered for array is: " + size);
			int num[] = new int[size];
			
			for (int j=0; j<num.length; j++)
			{
				System.out.println("Please enter value for " + (j+1) +":");
				num[j] = sc.nextInt();
			}
		}
		*/
		
		int a[] = {1, 5, 9, 3, 7};
		int b[] = {1, 7, 9, 3};
		new Q10().addTwoArray(a, b);
		
	}

}
