package RahulH.CoreJavaAssignment3.ClassesAndObjects;

import java.util.Scanner;

public class BankClient extends Bank{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter accNo, name, amount and withdraw amt");
		
		int accNo = sc.nextInt();
		String name = sc.next();
		int amount = sc.nextInt();
		int wamount = sc.nextInt();
		
		Bank b = new BankClient();
		b.insertData(accNo, name, amount, wamount);
		sc.close();
	}

}
