package coreJavaAssignment3.classAndObjects;

public class Bank {
	
	int account_no;
	String name;
	int amount;
	int depositCount = 0;
	int withdrawCount = 0;
	
	void insertData(int accNo, String nameReceived, int amtReveived, int amtWithdraw)
	{
		account_no = accNo;
		name = nameReceived;
		amount = amtReveived;
		deposit(amtReveived);
		withdraw(amtWithdraw);
	}
	
	private void deposit(int amtReveived)
	{
		amount = amtReveived;
		System.out.println("Amout credited: " +amtReveived);
		depositCount++;
		checkBalance();
	}
	
	private void withdraw(int amtWithdraw)
	{
		amount = amount-amtWithdraw;
		System.out.println("Amount debited: " +amtWithdraw);
		withdrawCount++;
		checkBalance();
	}
	
	private void checkBalance()
	{
		System.out.println("Available balance is: " +amount);
		displayDetails();
	}
	
	void displayDetails()
	{
		System.out.println("For account " +account_no+ " credit count is " + depositCount +" and debited count is " +withdrawCount);
	}
}
