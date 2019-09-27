package coreJavaAssignment3.classAndObjects;

public class Addition {
	
	int isum;
	double dsum;
	String ssum;
	
	void AddTwoIntegers(int i1, int i2)
	{
		isum = i1 + i2;
		System.out.println("Total integer sum is: " +isum);
	}

	void AddTwoDecimal(double d1, double d2)
	{
		dsum = d1 + d2;
		System.out.println("Total double sum is: " +dsum);
	}
	
	void AddTwoString(String s1, String s2)
	{
		ssum = s1 + s2;
		System.out.println("Concatinaton of string is: " +s1+s2);
	}
}
