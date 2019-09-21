package Hemali;

import java.util.Scanner;

public class Problem5 {
	static void Armstrong(int originalNumber)
	{
	int num=originalNumber;
	int rev=0;
	while(originalNumber!=0)
	{
		int temp=originalNumber%10;
		originalNumber=originalNumber/10;
		rev=rev+(temp*temp*temp);
		
	}
	
	if(rev==num)
	{
		System.out.println("Number is armstrong : "+rev);
	}
	else
		System.out.println("Number is not armstrong");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int originalNumber=sc.nextInt();
		Armstrong(originalNumber);
	}

}
