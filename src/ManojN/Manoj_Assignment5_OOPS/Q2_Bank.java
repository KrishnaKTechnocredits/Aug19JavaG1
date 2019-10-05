package ManojN.Manoj_Assignment5_OOPS;

public class Q2_Bank {
	int accountNo;
	String name;
	static double amount;
	int count =0;
	int count1=0;
	void insertData(int accountNo,String name,double amt){
		accountNo = accountNo;
		name = name;
		amount = amount+amt;
	}
	void deposit (float amt){
		amount = amount + amt;
		count++;
		
	}
	void withdraw(float amt){
		if (amount >=amt){
		amount = amount - amt;
		count1++;}
	}
	void checkBalance(String ch){
		if (ch.equalsIgnoreCase("Y"))
		System.out.println(amount);
	}
	void displayDetails(){
		
	}
	
}
	

