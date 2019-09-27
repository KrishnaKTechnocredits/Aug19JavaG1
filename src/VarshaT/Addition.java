/*
 6. Create a class Addition and write add method for: a) add two integers b) add two decimal c) add two String 
 */

package VarshaT;

public class Addition {
	Object a,b;
	void add(int a, int b)
	{
		System.out.println("Sum of "+a+" + "+b+"="+(a+b));
	}
	void add(double a, double b)
	{
		System.out.println("Sum of "+a+" + "+b+"="+(a+b));
	}
	void add(String a, String b)
	{
		System.out.println("Sum of "+a+" + "+b+"="+(a+b));
	}
	public static void main(String[] args) {
		Addition addition= new Addition();
		addition.add(40, 50);
		addition.add(40.9, 50.12);
		addition.add("TECHNO","CREDITS");
	}

}
