/*
Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String
 */
package DimpleB;

public class Addition {

	private String str1="";
	private String str2="";
	private double number1;
	private double number2;
	private int num1;
	private int num2;
	private void add(int m,int n)
	{
		System.out.println("Sum of two integers is :"+(m+n));
	}
	private void add(double b ,double a)
	{
		System.out.println("Sum of two decimal numbers is :"+(a+b));
	}
	private void add(String s ,String t)
	{
		System.out.println("Concatenated string is :"+s+t);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		a.add(125, 489);
		a.add(29.37, 91.3);
		a.add("Techno", "credits");
	}
}
