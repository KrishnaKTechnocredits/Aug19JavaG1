/*Create Bank class with fields account_no, name and amount .
 * Create the following methods: Make it menu Driven Program using switch. 
Use Scanner class for taking inputs from User a) insertData()… [To save account_no, name and amount given by user]. 
b) deposit() c) withdraw() d) checkBalance() e) displayDetails() 
Create BankClient class  to test functionalities of Bank class. */

package GayatriG;

import java.util.Scanner;

public class Assignment5Part2Ex2Bank {
	static Scanner sc=new Scanner(System.in);
	private static int acc_no;
	private static String name;
	private static double amt;
	private static  int balance=1000;
	
	static void functionalityTest(int input){
		switch(input){
		case 1:
			System.out.println("Enter the account No :");
			acc_no=sc.nextInt();
			System.out.println("Enter name of the customer: ");
			name=sc.next();
			System.out.println("Enter the amount : ");
			balance=sc.nextInt();
		case 2:
			System.out.println("Enter the amount to be deposited : ");
			int amount=sc.nextInt();
			balance=balance +amount;
		case 3:
			System.out.println("enter amount to be withdrawn");
			int amountw=sc.nextInt();
			if(balance>amountw){
				balance=balance-amountw;
			}else
				System.out.println("Insufficient funds");
		case 4:
			System.out.println("Current balance is : "+balance);
		}
	}
}
	
	/*static void insertData(){
		System.out.println("Enter the account No :");
		acc_no=sc.nextInt();
		System.out.println("Enter name of the customer: ");
		name=sc.next();
		System.out.println("Enter the amount : ");
		balance=sc.nextInt();
		
	}
	static void deposit(){
		System.out.println("Enter the amount to be deposited : ");
		int amount=sc.nextInt();
		balance=balance +amount;
	}
	
	static void withdraw(){
		System.out.println("enter amount to be withdrawn");
		int amount=sc.nextInt();
		if(balance>amount){
			balance=balance-amount;
		}else
			System.out.println("Insufficient funds");
	}
	static void checkBalance(){
		System.out.println("Current balance is : "+balance);
	}
}
	

*/