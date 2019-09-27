/*
 Create Bank class with fields account_no, name and amount .
 Create the following methods: Make it menu Driven Program using switch. 
Use Scanner class for taking inputs from User 
a) insertData()… [To save account_no, name and amount given by user].
 b) deposit() 
 c) withdraw() 
 d) checkBalance() 
 e) displayDetails() 
Create BankClient class  to test functionalities of Bank class. 
 */




//Refer BankClient call for class calling
package VarshaT;

import java.util.Scanner;

public class Bank {
	private int acc_no;
	private float amount;
	private String name;
	Scanner sc = new Scanner(System.in);
	void insertData(int acc_no,float amount,String name)
	{
		this.acc_no=acc_no;
		this.amount=amount;
		this.name=name;
	}
	void deposit(float amt)
	{
		if(name==null || amount==0.0f || acc_no==0)
		{
			System.out.println("enter details first\n \n ");
		}
		else{
		amount+=amt;
		}
	}
	void withdraw(float amt)
	{
		if(name==null || amount==0.0f || acc_no==0)
		{
			System.out.println("enter details first\n \n ");
		}
		else{
		if(amt<amount)
			amount-=amt;
		else
			System.out.println("Insufficient balance");
		}
	}
	void checkBalance()
	{
		if(name==null || amount==0.0f || acc_no==0)
		{
			System.out.println("enter details first\n \n ");
		}
		else
		System.out.println("Current Balance:"+amount);
	}
	void displayDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Account Number: "+acc_no);
		System.out.println("Current Balance: "+ amount);
	}

}
