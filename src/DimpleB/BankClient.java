/*
 Create Bank class with fields account_no, name and amount .Create the following methods: Make it menu Driven Program using switch.
Use Scanner class for taking inputs from User
a) insertData()… [To save account_no, name and amount given by user].
b) deposit()
c) withdraw()
d) checkBalance()
e) displayDetails()
Create BankClient class to test functionalities of Bank class.
 */
package DimpleB;

public class BankClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank c=new Bank();
		c.bankoperations();
	}
}
