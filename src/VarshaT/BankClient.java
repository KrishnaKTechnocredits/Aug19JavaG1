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

package VarshaT;

import java.util.Scanner;

public class BankClient {

	private int choice,acc_no;
	private float amount;
	private String name;
	Scanner sc = new Scanner(System.in);
	void menu()
	{
		System.out.println("Press 1 to save personal data.");
		System.out.println("Press 2 to deposit money.");
		System.out.println("Press 3 to withdraw money.");
		System.out.println("Press 4 to check balance.");
		System.out.println("Press 5 To check details");
		System.out.println("Press 6 to exit.");
		System.out.println("Enter your choice:");
		choice= sc.nextInt();
	}
	void input()
	{
		System.out.println("enter the name:");
		name = sc.nextLine();
		System.out.println("enter account number:");
		acc_no = sc.nextInt();
		System.out.println("enter the balance:");
		amount = sc.nextFloat();
	}
	void call(Bank bank)
	{
		float amt;
		switch(choice)
		{
		case 1:
			bank.insertData(acc_no,amount,name);
			break;
		case 2:
			System.out.println("enter the amount to be deposited:");
			amt=sc.nextFloat();
			bank.deposit(amt);
			break;
		case 3:
			System.out.println("enter the amount to be withdrawn:");
			amt=sc.nextFloat();
			bank.withdraw(amt);
			break;
		case 4:
			bank.checkBalance();
			break;
		case 5:
			bank.displayDetails();
			break;
		case 6:
			System.exit(0);
		default:
			System.out.println("enter correct choice");
		}
		
	}

	public static void main(String[] args) {
		BankClient bankClient= new BankClient();
		Bank bank=new Bank();
		while(bankClient.choice!=6){
		bankClient.menu();
		bankClient.call(bank);
		}
		

	}

}
