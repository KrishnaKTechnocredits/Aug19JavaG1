package RahulH.CoreJavaAssignment3.ClassesAndObjects;

import java.util.Scanner;

public class TestAddition extends Addition{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 2 integer numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Two integer numbers entered are: " + num1 +" and " + num2);
		
		System.out.println("Please enter 2 double numbers");
		double dNum1 = sc.nextDouble();
		double dNum2 = sc.nextDouble();
		System.out.println("Two double numbers entered are: " + dNum1 + " and " + dNum2);
		
		System.out.println("Please enter 2 strings");
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println("Two string values are: " + str1 + " and " +str2);
		
		Addition a = new TestAddition ();
		a.AddTwoIntegers(num1, num2);
		a.AddTwoDecimal(dNum1, dNum2);
		a.AddTwoString(str1, str2);
		
		sc.close();
	}
}
