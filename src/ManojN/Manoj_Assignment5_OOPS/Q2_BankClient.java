package ManojN.Manoj_Assignment5_OOPS;
import java.util.Scanner;
public class Q2_BankClient {
	public static void main(String[] args) {
		Q2_Bank bank = new Q2_Bank ();
		Scanner sc = new Scanner(System.in);
		System.out.println("To initiate A/c enter Account No, Name and Amount");
		bank.insertData(sc.nextInt(), sc.next(), sc.nextDouble());
		System.out.println("Enter amount to deposit");
		bank.deposit((float) sc.nextDouble());
		System.out.println("Enter amount to withdraw");
		bank.withdraw((float)sc.nextDouble());
		System.out.println("Enter Y to check balance");
		bank.checkBalance(sc.next());
	}
}

